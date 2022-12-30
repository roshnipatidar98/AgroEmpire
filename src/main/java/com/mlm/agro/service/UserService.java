package com.mlm.agro.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.dto.LoginDto;
import com.mlm.agro.dto.UserDto;
import com.mlm.agro.entity.CreaditAndRewardEntity;
import com.mlm.agro.entity.RootEntity;
import com.mlm.agro.entity.TeamSizeEntity;
import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.exception.UserRegisterException;
import com.mlm.agro.repo.UserRepo;

@Service
public class UserService {

	private static final String DIRECT_MEMBER = "DIRECT_MEMBER";
	private static final String NON_ACTIVE_STATUS = "NON_ACTIVE";
	private static final String ROLE_CUSTOMER = "CUSTOMER";

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
		userEntity.setRole(ROLE_CUSTOMER);
		rootEntity.setSponsorId(userEntity.getUserId());
		rootEntity.setParentId1(userEntity.getParentId());
		teamSizeEntity.setSponsorId(userEntity.getParentId());
		teamSizeEntity.setChildId(userEntity.getUserId());
		teamSizeEntity.setChildName(userEntity.getName());
		teamSizeEntity.setChildStatus(userEntity.getStatus());
		rootService.insert(rootEntity);
		userRepo.save(userEntity);
		teamSizeService.insertIntoTeamSizeTable(teamSizeEntity);
		
		if (!DIRECT_MEMBER.equals(userEntity.getParentId())) {
		List<String> parentIds = rootService.getAllRoots(new RootEntity(), userEntity);
		}
		// if (!DIRECT_MEMBER.equals(userEntity.getParentId())) {

		/*
		 * for (String parentId : parentIds) { if (parentId != null &&
		 * !parentId.equals(DIRECT_MEMBER)) { List<TeamSizeEntity> directTeamList =
		 * teamSizeService.getDirectTeamList(parentId); List<TeamSizeEntity>
		 * inDirectTeamList = teamSizeService.getInDirectTeamList(parentId);
		 * creaditAndRewardService.setRewardsAndCreadit(directTeamList,
		 * inDirectTeamList, parentId); } }
		 */
		// }
	}

	public UserEntity getUser(LoginDto loginDto) {
		UserEntity userDetails = userRepo.findByUserAndPassword(loginDto.getUserId(), loginDto.getPassword());
		session.setAttribute("userDetails", userDetails);

		System.out.println("User details : " + userDetails);
		return userDetails;
	}

	public void updateUserStatus(UserDto userDto) throws UserRegisterException {

		boolean isIdexists = userRepo.existsById(userDto.getUserId());

		if (isIdexists == true) {
			UserEntity userEntity = userRepo.findById(userDto.getUserId()).get();
			if (!(userEntity.getMobileNo().equals(userDto.getMobileNo()))) {
				throw new UserRegisterException("Mobile No not existss, try again");
			}
			userEntity.setStatus(userDto.getUserStatus());
			userRepo.save(userEntity);
			TeamSizeEntity teamSizeEntity = teamSizeService.findBySponsorIdAndChildID(userEntity.getParentId(),
					userEntity.getUserId());
			teamSizeEntity.setChildStatus(userEntity.getStatus());
			teamSizeService.insertIntoTeamSizeTable(teamSizeEntity);
			List<String> parentIds = new ArrayList<String>();
			if (!DIRECT_MEMBER.equals(userEntity.getParentId())) {
				parentIds = rootService.getAllRoots(new RootEntity(), userEntity);
				parentIds.add(userEntity.getUserId());
				for (String parentId : parentIds) {
					if ((parentId != null && !parentId.equals(DIRECT_MEMBER))) {
						if (!(userRepo.findById(parentId).get().getStatus().equals(NON_ACTIVE_STATUS))) {
							List<TeamSizeEntity> directTeamList = teamSizeService.getDirectTeamList(parentId);
							List<TeamSizeEntity> inDirectTeamList = teamSizeService.getInDirectTeamList(parentId);
							creaditAndRewardService.setRewardsAndCreadit(directTeamList, inDirectTeamList, parentId);
						}
					}
				}
			} else {
				List<TeamSizeEntity> directTeamList = teamSizeService.getDirectTeamList(userEntity.getUserId());
				List<TeamSizeEntity> inDirectTeamList = teamSizeService.getInDirectTeamList(userEntity.getUserId());
				creaditAndRewardService.setRewardsAndCreadit(directTeamList, inDirectTeamList, userEntity.getUserId());
			}

		} else {
			throw new UserRegisterException("UserID does not existss, try again");
		}

	}

}
