package com.Project.HRS.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.HRS.UserEntity.User;
import com.Project.HRS.UserService.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	 private UserService userService;
	
	
	@PostMapping("/save")
	 public ResponseEntity<User>saveUser(@RequestBody User user){
		User user2= userService.save(user);
		return new ResponseEntity<User>(user2,HttpStatus.CREATED);
		
	}
	@GetMapping("/getbyid/{id}")//getbyid/01
	public ResponseEntity<User> getById(@PathVariable String id){
		User user2=userService.getById(id);
		return new ResponseEntity<User>(user2,HttpStatus.OK);
		
	}

}
