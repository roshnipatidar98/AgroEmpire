package com.mlm.agro.repo;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mlm.agro.entity.TeamSizeEntity;

@Repository
public interface TeamSizeRepo extends CrudRepository<TeamSizeEntity, String> {

	 @Query("select NEW com.mlm.agro.entity.TeamSizeEntity (ts.sponsorId, ts.childName, ts.childId, ts.childStatus) from team_size as ts where sponsorId = :title")
	 List<TeamSizeEntity> findBySponsorId(@Param("title") String sponsorId);
	
	 @Query("select NEW com.mlm.agro.entity.TeamSizeEntity (ts.sponsorId, ts.childName, ts.childId, ts.childStatus) from team_size as ts where sponsorId in :ids" )
	 List<TeamSizeEntity> findBySponsorIds(@Param("ids") Set<String> sponsorIdList);

	 @Transactional
	 @Modifying
	 @Query("update com.mlm.agro.entity.TeamSizeEntity as ts set ts.childStatus = :title1 where ts.childId = :title2")
	 Integer update(@Param("title1") String childStatus, @Param("title2") String childId);

}
