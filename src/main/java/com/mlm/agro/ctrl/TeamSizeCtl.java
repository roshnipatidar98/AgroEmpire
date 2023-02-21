package com.mlm.agro.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.agro.config.APIConstants;
import com.mlm.agro.service.TeamSizeService;

@RestController
public class TeamSizeCtl {
	
	@Autowired
	private TeamSizeService teamSizeService;
	
	
	@GetMapping(APIConstants.GET_DIRECT_TEAM_API)
	@Procedure(APIConstants.RESPONSE_IN_JSON)
	public List getDirectTeam(@PathVariable("id") String userId) {
		List list = teamSizeService.getDirectTeamList(userId);
		return list;
	}
	
	@GetMapping(APIConstants.GET_IN_DIRECT_TEAM_API)
	@Procedure(APIConstants.RESPONSE_IN_JSON)
	public List getIndirectTeam(@PathVariable("id") String userId) {
		List list = teamSizeService.getInDirectTeamList(userId);
		return list;
	}
	
	

}
