package com.example.spring.issues.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String index() {
		return " Greetings from Hello Controller!! ";
	}

}
