package com.tclabs.trainee.service;

import com.tclabs.trainee.dto.TraineeDto;
import com.tclabs.trainee.model.TraineeEntity;



public interface ITraineeInfoService {
	
public TraineeEntity registerTrainee(TraineeDto traineeDto);
}
