package com.dailtycodebuffer.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailtycodebuffer.springbootdemo.model.User;

@RestController
@RequestMapping("/")
public class HomeController {


	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/user")
	public User getUser() {
		User user = new User("1", "Mazhar", "mazhar@max.com");
		
		return user;
	}
}
