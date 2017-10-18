package com.tclabs.trainee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public ModelAndView redierctToWelcomePage(@RequestParam("id") int id, @RequestParam("name") String name) {
		System.out.println("WelcomeController.redierctToWelcomePage()"+id+name);
		ModelAndView mv = new ModelAndView("welcomePage");
		mv.addObject("id", id);
		mv.addObject("name", name);
		return mv;
	}

}
