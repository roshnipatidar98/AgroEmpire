package com.mlm.agro.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.agro.service.TeamSizeService;

@RestController
public class TeamSizeCtl {
	
	@Autowired
	private TeamSizeService teamSizeService;
	
	

}
