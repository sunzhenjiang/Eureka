package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itmuch.cloud.entity.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("", User.class);
	}
}
