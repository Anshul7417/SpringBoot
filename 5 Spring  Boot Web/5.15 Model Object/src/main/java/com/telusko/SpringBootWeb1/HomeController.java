package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
		// If we directly write num1 and num2 it will work but name will be same as jsp

		int result = num1 + num2;
		model.addAttribute("result", result);
		// We can transfer data between controller and view using model object

		return "result";    // Now we have removed .jsp extension and add a subfolder in webapp named view. This is not working.
	}

}
