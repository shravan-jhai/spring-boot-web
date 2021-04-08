package com.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringBootController {
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("obj",alien);
		modelAndView.setViewName("home");
		
		
		
		return modelAndView;
	}

}
