package com.mlm.agro.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.entity.RootEntity;
import com.mlm.agro.entity.TeamSizeEntity;
import com.mlm.agro.repo.TeamSizeRepo;

@Service
public class TeamSizeService {
	
	@Autowired
	private TeamSizeRepo teamSizeRepo;
	
	
	public void insertIntoTeamSizeTable(TeamSizeEntity teamSizeEntity) {
		teamSizeRepo.save(teamSizeEntity);
	}
	
	public List getDirectParentTeamList(TeamSizeEntity teamSizeEntity, String sponsorId) {
	List directTeamlist = teamSizeRepo.findBySponsorId(sponsorId);
	System.out.println("Direct Team size of "+ sponsorId+" is : "+directTeamlist.size());
	return directTeamlist;
	}
	
	public List getInDirectParentTeamList(TeamSizeEntity teamSizeEntity, String sponsorId) {
		Set<String> setOfIds = new HashSet<String>();
		List<TeamSizeEntity> inDirectTeamlist = null;
		setOfIds.add(sponsorId);
		for (int i = 0; i<10; i++) {
			 inDirectTeamlist = teamSizeRepo.findBySponsorIds(setOfIds);
			 for(TeamSizeEntity iterateFromList : inDirectTeamlist) {
				 setOfIds.add(iterateFromList.getChildId());
			 }
		}
		System.out.println("In Direct Team size of "+ sponsorId +" is : "+teamSizeRepo.findBySponsorIds(setOfIds).size());
		return teamSizeRepo.findBySponsorIds(setOfIds);
	}

}
