package com.mlm.agro.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.service.UserService;

@RestController
public class UserCtrl {
	
 @Autowired
 private UserService service ;
 
 
   @PostMapping("/registerUser")
	protected void addUser(@RequestBody UserEntity entity) {
	   System.out.println("controller called");
		service.addUser(entity);
	}
	
	protected void updateUser() {
		
	}

}
