package com.mlm.agro.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.agro.config.APIConstants;
import com.mlm.agro.config.APIConstants;
import com.mlm.agro.config.APIConstants;
import com.mlm.agro.service.CreditAndRewardService;

@RestController
public class CreditAndRewardsCtrl {
	
	@Autowired
	private CreditAndRewardService service;
	
	
  @GetMapping(APIConstants.GET_REWARDS_API)
  @Procedure(APIConstants.RESPONSE_IN_JSON)
  protected List getRewards(@PathVariable("id") String userId){
	 List list =  service.getRewards(userId);
	return list;	
	}
  
  @GetMapping(APIConstants.GET_CREDIT_API)
  @Procedure(APIConstants.RESPONSE_IN_JSON)
  protected List getCreditLimit(@PathVariable("id") String userId){
	 List list =  service.getCreditLimit(userId);
	return list;	
	}
  
  
	/*
	 * @PostMapping protected void updateRewards() {
	 * 
	 * }
	 * 
	 * @PostMapping protected void updateCreditLimit() {
	 * 
	 * }
	 */

}
