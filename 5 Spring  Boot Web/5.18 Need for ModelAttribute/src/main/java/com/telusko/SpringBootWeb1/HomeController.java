package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("addAlien")
	public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
		Alien alien = new Alien();
		alien.setAid(aid);
		alien.setAname(aname);
		mv.addObject("alien", alien);
		mv.setViewName("result");

		// In here we are using multiple requestparams which are difficult to manage Hence we need modelattribute

		return mv;
	}

}
