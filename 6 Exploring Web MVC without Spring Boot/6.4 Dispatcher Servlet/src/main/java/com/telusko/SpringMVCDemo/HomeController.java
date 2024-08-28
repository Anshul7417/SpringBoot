package com.telusko.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		// public String addAlien(@ModelAttribute("alien1") Alien alien) {

		return "result";
	}

	//in web.xml we have configured dispatcher servlet.

}
