package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

		int result = num1 + num2;
		// Above we are using model object and returning view in function return type but we can use modelandview object to do all at once
		mv.addObject("result",result);
		mv.setViewName("result");   

		return mv;
	}

}
