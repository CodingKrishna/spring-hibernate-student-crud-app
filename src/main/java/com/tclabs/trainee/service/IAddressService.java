package com.tclabs.trainee.service;

import com.tclabs.trainee.dto.TraineeAddressDto;
 
public interface IAddressService {
public TraineeAddressDto addTraineeAddress(TraineeAddressDto traineeAddressDto);
public TraineeAddressDto updatTraineeAddress(TraineeAddressDto traineeAddressDto);
public TraineeAddressDto deleteTraineeAddress(TraineeAddressDto traineeAddressDto);

}
