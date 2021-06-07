package com.san.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return "Hi "+name+" welcome to my Page...";
	}

}
