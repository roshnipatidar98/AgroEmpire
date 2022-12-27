package com.mlm.agro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.entity.CreaditAndRewardEntity;
import com.mlm.agro.entity.TeamSizeEntity;
import com.mlm.agro.repo.CreaditAndRewardRepo;

@Service
public class CreaditAndRewardService {

	@Autowired
	private CreaditAndRewardRepo creaditAndRewardRepo;

	public void insertIntoCreaditAndRewardTable(CreaditAndRewardEntity creaditAndRewardEntity) {
		creaditAndRewardRepo.save(creaditAndRewardEntity);
	}

	public void setRewardsAndCreadit(List directTeamList, List inDirectTeamList, String sponsorId) {
		CreaditAndRewardEntity creaditAndRewardEntity = new CreaditAndRewardEntity();
		creaditAndRewardEntity.setSponsorId(sponsorId);
		System.out.println("Benefits of : "+sponsorId);
		if (directTeamList.size() >= 3) {

			// creadit limit calculation
			int calculatedCredit = 10000 + ((inDirectTeamList.size() - 3) * 300);

			if (calculatedCredit <= 45100) {
				creaditAndRewardEntity.setCreditLimit(calculatedCredit);
				System.out.println("Creadit Limit : " + calculatedCredit);
			} else {
				creaditAndRewardEntity.setCreditLimit(45100);
				System.out.println("Creadit Limit : " + 45100);
			}
			
			// rewards calculation
			int calculatedRewards = 0;
			if (inDirectTeamList.size() >= 6) {
				calculatedRewards = 5000;
			} else if (inDirectTeamList.size() >= 39) {
				calculatedRewards = 5000 + 5100;
			} else if (inDirectTeamList.size() >= 1000) {
				calculatedRewards = 5000 + 5100 + 111000;
			} else if (inDirectTeamList.size() >= 5000) {
				calculatedRewards = 5000 + 5100 + 111000 + 2100000;
			}
			creaditAndRewardEntity.setRewards(calculatedRewards);
			System.out.println("Rewards : " + calculatedRewards);
			
			
			// dicousnt calculation
			String discount = "10%";
			if (inDirectTeamList.size() >= 101) {
				discount = "15%";
			} else if (inDirectTeamList.size() >= 201) {
				discount = "20%";
			} else if (inDirectTeamList.size() >= 301) {
				discount = "25%";
			} else if (inDirectTeamList.size() >= 401) {
				discount = "30%";
			} else if (inDirectTeamList.size() >= 501) {
				discount = "40%";
			}

			creaditAndRewardEntity.setDiscount(discount);
			System.out.println("Discount : " + discount);
		}
		
		insertIntoCreaditAndRewardTable(creaditAndRewardEntity);
	}
}
