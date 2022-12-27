package com.mlm.agro.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mlm.agro.entity.CreaditAndRewardEntity;

@Repository
public interface CreaditAndRewardRepo extends CrudRepository<CreaditAndRewardEntity, String>{

}
