package com.spring.mongo.feign.api;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.feign.api.client.UserClient;
import com.spring.mongo.feign.api.dto.User;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringMongoFeignApplication {

	
	private UserClient client;
	
	@GetMapping("/findAllUser")
	public List<User> getAllUser(){
		return client.getAllUser();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMongoFeignApplication.class, args);
	}

}
