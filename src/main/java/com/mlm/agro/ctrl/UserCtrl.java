package com.mlm.agro.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.agro.entity.RootEntity;
import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.exception.UserRegisterException;
import com.mlm.agro.service.RootService;
import com.mlm.agro.service.UserService;

@RestController
public class UserCtrl {
	
 @Autowired
 private UserService userService ;
 
 
 //@Autowired
// private RootService rootService;
 
 
   @PostMapping("/registerUser")
	protected void addUser(@RequestBody UserEntity entity) {
	   System.out.println("controller called");
	   try {
		   userService.addUser(entity);
		  
	   }catch(Exception exception) {
		   if(exception instanceof UserRegisterException) {
			   System.out.println("Ctrl catched exception : " + exception.getMessage() );
		   }else {
			   System.out.println("Runtime exception : " + exception.getMessage() );  
		   }
	   }
		
	}
	
	protected void updateUser() {
		
	}

	
	

}
