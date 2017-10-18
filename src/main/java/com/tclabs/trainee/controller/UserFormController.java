package com.tclabs.trainee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tclabs.trainee.dto.UserDTO;

@Controller
public class UserFormController {
	@RequestMapping(value = "userForm", method = RequestMethod.GET)
	public String userDetailsGet(@ModelAttribute("userdto") UserDTO userdto) {
		userdto.setUserName("Suresh");
		return "userForm";
	}

	@RequestMapping(value = "userDetails", method = RequestMethod.POST)
	public ModelAndView userDetailsPost(@ModelAttribute("userdto") UserDTO userdto) {
		System.out.println(userdto);
		/*
		  request.setAttribute("userName", userdto.getUserName());
		  request.setAttribute("email", userdto.getEmail());
		  request.setAttribute("phoneNum", userdto.getPhoneNum());
		 */

		ModelAndView mv = new ModelAndView("userDetails");
		mv.addObject("userName", userdto.getUserName());
		mv.addObject("email", userdto.getEmail());
		mv.addObject("phoneNum", userdto.getPhoneNum());

		return mv;
	}
}
