package com.greatlearning.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
	
	
	@GetMapping("/")
	public String login() {
		return("<h1>Logged In</h1>");
	}

}
