package com.mlm.agro.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mlm.agro.entity.CreditAndRewardEntity;

@Repository
public interface CreditAndRewardRepo extends CrudRepository<CreditAndRewardEntity, String>{

	@Query("select cr.rewards from credit_rewards as cr where cr.sponsorId = :title1")
	List findMyRewards(@Param("title1") String sponsorId);
	
	@Query("select cr.creditLimit from credit_rewards as cr where cr.sponsorId = :title1")
	List findMyCreditLimit(@Param("title1") String sponsorId);

}
