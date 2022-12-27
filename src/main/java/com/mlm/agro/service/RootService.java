package com.mlm.agro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlm.agro.entity.RootEntity;
import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.repo.RootRepo;

@Service
public class RootService {

	@Autowired
	private RootRepo rootRepo;
	
	private UserEntity userEntity;
	
	
	public void insert(RootEntity rootEntity) {
		rootRepo.save(rootEntity);
	}
	
	
	
	public Optional<RootEntity>  findAllParentIds(UserEntity userEntity) {
		Optional<RootEntity> entityResultSet = rootRepo.findById(userEntity.getParentId());
		return entityResultSet;
	}
	
	public List setRootEntity(RootEntity rootEntity, UserEntity userEntity) {
		Optional<RootEntity> userEntityResultSet = findAllParentIds(userEntity);
		
		rootEntity.setSponsorId(userEntity.getUserId());
		rootEntity.setParentId1(userEntity.getParentId());
		rootEntity.setParentId2(userEntityResultSet.get().getParentId1());
		rootEntity.setParentId3(userEntityResultSet.get().getParentId2());
		rootEntity.setParentId4(userEntityResultSet.get().getParentId3());
		rootEntity.setParentId5(userEntityResultSet.get().getParentId4());
		rootEntity.setParentId6(userEntityResultSet.get().getParentId5());
		rootEntity.setParentId7(userEntityResultSet.get().getParentId6());
		rootEntity.setParentId8(userEntityResultSet.get().getParentId7());
		rootEntity.setParentId9(userEntityResultSet.get().getParentId8());
		rootEntity.setParentId10(userEntityResultSet.get().getParentId9());
		
		List<String> allRootParents = new ArrayList<String>();
		allRootParents.add(userEntity.getUserId());
		allRootParents.add(userEntity.getParentId());
		allRootParents.add(userEntityResultSet.get().getParentId1());
		allRootParents.add(userEntityResultSet.get().getParentId2());
		allRootParents.add(userEntityResultSet.get().getParentId3());
		allRootParents.add(userEntityResultSet.get().getParentId4());
		allRootParents.add(userEntityResultSet.get().getParentId5());
		allRootParents.add(userEntityResultSet.get().getParentId6());
		allRootParents.add(userEntityResultSet.get().getParentId7());
		allRootParents.add(userEntityResultSet.get().getParentId8());
		allRootParents.add(userEntityResultSet.get().getParentId9());
		
		updateRootTable(rootEntity);
		
		return allRootParents;
	}
	
	public void updateRootTable(RootEntity entity) {
		rootRepo.save(entity);
	}

}
