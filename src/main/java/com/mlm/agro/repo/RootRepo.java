package com.mlm.agro.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mlm.agro.entity.RootEntity;

@Repository
public interface RootRepo extends CrudRepository<RootEntity, String> {

//	@Query("select * from user  where sponsorId = :title")
//	List findByParentOneId(String parentId1);

}
