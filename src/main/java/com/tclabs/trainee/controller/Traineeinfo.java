package com.tclabs.trainee.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tclabs.trainee.dto.TraineeDto;
import com.tclabs.trainee.model.TraineeEntity;
import com.tclabs.trainee.service.ITraineeInfoService;

@Controller
@RequestMapping(value = "candit")
public class Traineeinfo {
	
	@Autowired
	@Qualifier("traineeInfoServiceImpl")
	ITraineeInfoService iTraineeInfoService;

	@RequestMapping(value = "register")
	public String contactInfoGet(@ModelAttribute("traineeDto") TraineeDto traineeDto) {
		return "newcandidateform";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String contactInfoPost(@ModelAttribute("traineeDto") TraineeDto traineeDto,HttpSession session) {
        if(traineeDto!=null){
		TraineeEntity traineeEntity = iTraineeInfoService.registerTrainee(traineeDto);
		long b=traineeEntity.getId();
		System.out.println(b);
		if (b!=0) {
			session.setAttribute("trainee", traineeEntity);
			System.out.println(session.getAttribute("trainee"));
	  		return "redirect:/canditQualification/qualificationform.mmm";
			
		}
		return "error";
	}
     return "error";   
	}
}
