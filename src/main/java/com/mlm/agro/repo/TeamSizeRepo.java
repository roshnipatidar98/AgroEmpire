package com.mlm.agro.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mlm.agro.entity.TeamSizeEntity;

@Repository
public interface TeamSizeRepo extends CrudRepository<TeamSizeEntity, String> {

	 @Query("select NEW com.mlm.agro.entity.TeamSizeEntity (ts.sponsorId, ts.childName, ts.childId) from team_size as ts where sponsorId = :title")
	 List<TeamSizeEntity> findBySponsorId(@Param("title") String sponsorId);
	
	 @Query("select NEW com.mlm.agro.entity.TeamSizeEntity (ts.sponsorId, ts.childName, ts.childId) from team_size as ts where sponsorId in :ids" )
	 List<TeamSizeEntity> findBySponsorIds(@Param("ids") Set<String> sponsorIdList);

}
