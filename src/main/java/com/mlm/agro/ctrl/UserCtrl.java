package com.mlm.agro.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlm.agro.dto.LoginDto;
import com.mlm.agro.dto.UserDto;
import com.mlm.agro.entity.UserEntity;
import com.mlm.agro.exception.UserRegisterException;
import com.mlm.agro.service.UserService;

@RestController
public class UserCtrl {
	
 @Autowired
 private UserService userService ;
 
 
 //@Autowired
// private RootService rootService;
 
 
   @PostMapping("/registerUser")
	protected ResponseEntity addUser(@RequestBody UserEntity entity) {
	   System.out.println("controller called");
	   try {
		   userService.addUser(entity);
		  
	   }catch(Exception exception) {
		   if(exception instanceof UserRegisterException) {
			   System.out.println("Ctrl catched exception : " + exception.getMessage() );
			   return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
		   }else {
			   System.out.println("Runtime exception : " + exception.getMessage()); 
			   return new ResponseEntity("Server error", HttpStatus.SERVICE_UNAVAILABLE);
		   }
		   
	   }
		return new ResponseEntity("User signed-up successfully!.", HttpStatus.OK);
	}
   
   @PutMapping("/changeUserStatus")
   protected ResponseEntity updateUserStatus(@RequestBody UserDto userDto) {
	   try {
		userService.updateUserStatus(userDto);
	} catch (Exception exception) {
		if(exception instanceof UserRegisterException) {
			   System.out.println("Ctrl catched exception : " + exception.getMessage() );
			   return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
		   }else {
			   System.out.println("Runtime exception : " + exception.getMessage()); 
			   exception.printStackTrace();
		   }
		
	}
	   return new ResponseEntity("User Status updated successfully!.", HttpStatus.OK);
	   
   }
	
   @PostMapping("/signinUser")
	protected ResponseEntity<UserEntity> loginUser(@RequestBody LoginDto loginDto) {
	   UserEntity UserEntity = userService.getUser(loginDto);
	return new ResponseEntity("User signed-In successfully!.", HttpStatus.OK);
	}

	
	

}
