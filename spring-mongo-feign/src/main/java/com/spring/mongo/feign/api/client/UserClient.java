package com.spring.mongo.feign.api.client;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.mongo.feign.api.dto.User;

@FeignClient(url="http://localhost:8088/api/users", name = "NEWS-USER")
//@Headers("Content-Type :application/json")
public interface UserClient {

	
	 @GetMapping("/abc")
		public List<User> getAllUser();
		 
	 @GetMapping("/{id}")
	 public User getUserByid(@PathVariable("id") ObjectId id);
	 
//	 @PostMapping("/name")
//	 public User findByusername(@RequestBody User name);
}
