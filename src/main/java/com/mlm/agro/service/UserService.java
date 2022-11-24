package com.mlm.agro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	
	
	
	public void addUser(UserEntity entity) {
		System.out.println("service called");
		repo.existsById(entity.getUserId());
		repo.findByParentId(entity.getParentId());
		repo.findByMobileNo(entity.getMobileNo());
		entity.setReferalLink(null);
		entity.setStatus("N");
		repo.save(entity);
	}

	
	
}
