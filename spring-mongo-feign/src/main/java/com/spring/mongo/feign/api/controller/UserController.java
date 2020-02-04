package com.spring.mongo.feign.api.controller;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.feign.api.client.UserClient;
import com.spring.mongo.feign.api.dto.User;


@RestController
@RequestMapping("/api/feign")
public class UserController {
	
	 @Autowired
	 UserClient userClient;
		
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	 @GetMapping("")
	public List<User> getAllUser() {
	 return userClient.getAllUser();
	 }
	 
	 @GetMapping("/{id}")
		public User identification(@PathVariable("id") ObjectId id){
		 System.out.println("caleed/........");
		 return userClient.getUserByid(id);
		 }
	 
//	 @PostMapping("/name")
//		public User identification(@RequestBody User name){
//		 System.out.println("caleed/........");
//		 return userClient.findByusername(name);
//		 }
		 	  

}
