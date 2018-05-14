package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/users/{id}")
	private User getById(@PathVariable Long id) {
		return this.userservice.findOne(id); 
	}
}
