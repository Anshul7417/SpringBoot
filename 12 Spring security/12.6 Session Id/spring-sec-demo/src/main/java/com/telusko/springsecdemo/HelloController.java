package com.telusko.springsecdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String greet(HttpServletRequest request) {          //used to print session id
		// BAsically we are able to navigate with the help of session
		return "Hello World "+request.getSession().getId();
	}
	
	@GetMapping("about")
	public String about(HttpServletRequest request) {
		return "Telusko "+request.getSession().getId();
	}
}
