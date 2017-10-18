package com.tclabs.trainee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tclabs.trainee.dto.TraineeAddressDto;
import com.tclabs.trainee.service.IAddressService;

@Controller
public class TraineeAddressController {

	@Autowired
	@Qualifier("traineeAddressServiceImpl")
	IAddressService addressService;

	@RequestMapping(value = "addTraineeAddress", method = RequestMethod.GET)
	public String addTraineeAddress(
			@ModelAttribute TraineeAddressDto traineeAddressDto) {
		addressService.addTraineeAddress(traineeAddressDto);
		return "success";
	}

	public String updateTrainee(
			@ModelAttribute TraineeAddressDto traineeAddressDto) {
		addressService.updatTraineeAddress(traineeAddressDto);
		return "success";
	}

	public String deleteTrainee(
			@ModelAttribute TraineeAddressDto traineeAddressDto) {
		return "success";
	}
	
	
	
	
}
