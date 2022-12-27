package com.mlm.agro.service;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.dto.LoginDto;
import com.mlm.agro.entity.RootEntity;
import com.mlm.agro.entity.TeamSizeEntity;
import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.exception.UserRegisterException;
import com.mlm.agro.repo.RootRepo;
import com.mlm.agro.repo.TeamSizeRepo;
import com.mlm.agro.repo.UserRepo;

@Service
public class UserService {
	
	private static final String DIRECT_MEMBER = "DIRECT_MEMBER";
	private static final String NON_ACTIVE_STATUS  = "N";
	private static final String CUSTOMER = "CUSTOMER";

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private RootService rootService;

	@Autowired
	private TeamSizeService teamSizeService;

	@Autowired
	private CreaditAndRewardService creaditAndRewardService;
	
	@Autowired
	private HttpSession session;

	public void addUser(UserEntity userEntity) throws UserRegisterException {
		System.out.println("service called");
		RootEntity rootEntity = new RootEntity();
		TeamSizeEntity teamSizeEntity = new TeamSizeEntity();
		boolean isParentIdexists = true;
		boolean isIdexists = userRepo.existsById(userEntity.getUserId());
		List mNoList = userRepo.findByMobileNo(userEntity.getMobileNo());
		if (!(userEntity.getParentId() == null) && !(userEntity.getParentId() == "")) {
			isParentIdexists = userRepo.existsById(userEntity.getParentId());
		} else {
			userEntity.setParentId(DIRECT_MEMBER);
		}
		if (isIdexists == true) {
			throw new UserRegisterException("User ID already exists");
		} else if (mNoList.contains(userEntity.getMobileNo())) {
			throw new UserRegisterException("Mobile No is already registered");
		} else if (!isParentIdexists) {
			throw new UserRegisterException("Sponsor ID is wrong, please type again");
		}

		userEntity.setReferalLink(null);
		userEntity.setStatus(NON_ACTIVE_STATUS);
		userEntity.setRole(CUSTOMER);
		rootEntity.setSponsorId(userEntity.getUserId());
		rootEntity.setParentId1(userEntity.getParentId());
		teamSizeEntity.setSponsorId(userEntity.getParentId());
		teamSizeEntity.setChildId(userEntity.getUserId());
		teamSizeEntity.setChildName(userEntity.getName());
		rootService.insert(rootEntity);
		userRepo.save(userEntity);
		if (!DIRECT_MEMBER.equals(userEntity.getParentId())) {
			List<String> parentIds = rootService.setRootEntity(new RootEntity(), userEntity);
			teamSizeService.insertIntoTeamSizeTable(teamSizeEntity);
			for (String parentId : parentIds) {
				if(parentId != null && !parentId.equals(DIRECT_MEMBER)  ) {
					List directTeamList = teamSizeService.getDirectParentTeamList(teamSizeEntity, parentId);
					List inDirectTeamList = teamSizeService.getInDirectParentTeamList(teamSizeEntity, parentId);
					creaditAndRewardService.setRewardsAndCreadit(directTeamList, inDirectTeamList,
							parentId);
				}
			}
		}
	}
	

	public UserEntity getUser(LoginDto loginDto) {
	UserEntity userDetails = userRepo.findByUserAndPassword(loginDto.getUserId(), loginDto.getPassword());
    session.setAttribute("userDetails", userDetails);

	System.out.println("User details : " + userDetails);
	return userDetails;
	}

}
