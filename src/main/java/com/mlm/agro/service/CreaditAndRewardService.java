package com.mlm.agro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.entity.CreaditAndRewardEntity;
import com.mlm.agro.entity.TeamSizeEntity;
import com.mlm.agro.repo.CreaditAndRewardRepo;

@Service
public class CreaditAndRewardService {

	
	 private static final String ACTIVE_STATUS = "ACTIVE";

	 @Autowired
     private CreaditAndRewardRepo creaditAndRewardRepo;

	 
	 
	 public void insertIntoCreaditAndRewardTable(CreaditAndRewardEntity creaditAndRewardEntity) {
			creaditAndRewardRepo.save(creaditAndRewardEntity);
	 }
	 
	 
	 public void setRewardsAndCreadit(List<TeamSizeEntity> directTeamList, List<TeamSizeEntity> inDirectTeamList, String sponsorId) {
			CreaditAndRewardEntity creaditAndRewardEntity = new CreaditAndRewardEntity();
			creaditAndRewardEntity.setSponsorId(sponsorId);
			System.out.println("Benefits of : "+sponsorId);
			int directActiveChildUser = 0; int inDirectActiveChildUser = 0;
			
			for (TeamSizeEntity directTeam :directTeamList) {
				if(directTeam.getChildStatus().equals(ACTIVE_STATUS)) {
					directActiveChildUser++;
				}
			}
				
			for (TeamSizeEntity inDirectTeam :inDirectTeamList) {
				if(inDirectTeam.getChildStatus().equals(ACTIVE_STATUS)) {
					inDirectActiveChildUser++;
			}
			}
			
			
			if (directActiveChildUser >= 3) {

				// creadit limit calculation
				int calculatedCredit = 10000 + ((inDirectActiveChildUser - 3) * 300);

				if (calculatedCredit <= 45100) {
					creaditAndRewardEntity.setCreditLimit(calculatedCredit);
					System.out.println("Creadit Limit : " + calculatedCredit);
				} else {
					creaditAndRewardEntity.setCreditLimit(45100);
					System.out.println("Creadit Limit : " + 45100);
				}
				
				// rewards calculation
				int calculatedRewards = 0;
				if (inDirectActiveChildUser >= 6) {
					calculatedRewards = 5000;
				} else if (inDirectActiveChildUser >= 39) {
					calculatedRewards = 5000 + 5100;
				} else if (inDirectActiveChildUser >= 1000) {
					calculatedRewards = 5000 + 5100 + 111000;
				} else if (inDirectActiveChildUser >= 5000) {
					calculatedRewards = 5000 + 5100 + 111000 + 2100000;
				}
				creaditAndRewardEntity.setRewards(calculatedRewards);
				System.out.println("Rewards : " + calculatedRewards);
				
				
				// dicousnt calculation
				String discount = "10%";
				if (inDirectActiveChildUser >= 101) {
					discount = "15%";
				} else if (inDirectActiveChildUser >= 201) {
					discount = "20%";
				} else if (inDirectActiveChildUser >= 301) {
					discount = "25%";
				} else if (inDirectActiveChildUser >= 401) {
					discount = "30%";
				} else if (inDirectActiveChildUser >= 501) {
					discount = "40%";
				}
				
				creaditAndRewardEntity.setDiscount(discount);
				System.out.println("Discount : " + discount);
			}else {
			System.out.println(sponsorId+ " is not eligible for any benefits : ");
			}
			insertIntoCreaditAndRewardTable(creaditAndRewardEntity);
		}
	
}
		
