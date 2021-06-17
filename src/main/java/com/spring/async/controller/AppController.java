package com.spring.async.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.async.service.DemoService;

@RestController
public class AppController {
	
	@Autowired
	DemoService demoService;

	@GetMapping("/showMessage")
	public String showMessage() {
		
		demoService.someService();
		return "This is the message!!!";

	}
	
	@GetMapping("/handleError")
	public String demoError() {
		demoService.handleErrorAsync();
		
		return "Error handled";
	}

}
