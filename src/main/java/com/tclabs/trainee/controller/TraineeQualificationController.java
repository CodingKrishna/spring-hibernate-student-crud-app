package com.tclabs.trainee.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tclabs.trainee.dto.TraineeQualificationDto;
import com.tclabs.trainee.model.TraineeEntity;
import com.tclabs.trainee.service.ITraineeQualificationService;

@Controller
@RequestMapping(value = "canditQualification")
public class TraineeQualificationController {

	@Autowired
	@Qualifier("traineeQualificationServiceImpl")
	ITraineeQualificationService iTraineeQualificationService;

	@RequestMapping(value="qualificationform")
	public String save(@ModelAttribute("traineeQualificationDto") TraineeQualificationDto traineeQualificationDto) {
		
		return "qualificationform";
	}
	
	
	@RequestMapping(value="qualificationform",method=RequestMethod.POST)
	public String save(@ModelAttribute("traineeQualificationDto") TraineeQualificationDto traineeQualificationDto,Model model,HttpSession session) {
		
		TraineeEntity traineeEntity=(TraineeEntity)session.getAttribute("trainee");
		traineeQualificationDto.setTraineeEntity(traineeEntity);
		iTraineeQualificationService.saveTraineeQly(traineeQualificationDto);
		return "addressdetails";
		
	}
}