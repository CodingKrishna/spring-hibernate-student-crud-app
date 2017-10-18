package com.tclabs.trainee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tclabs.trainee.dao.TraineeAddressDao;
import com.tclabs.trainee.dto.TraineeAddressDto;
import com.tclabs.trainee.model.TraineeAddressEntity;
import com.tclabs.trainee.service.IAddressService;

@Service(value="traineeAddressServiceImpl")
/*@Transactional(propagation=Propagation.REQUIRED)*/
public class TraineeAddressServiceImpl implements IAddressService {
@Autowired
@Qualifier("traineeAddressDaoImpl")

TraineeAddressDao trineeAddressDao	;

@Override
public TraineeAddressDto addTraineeAddress(TraineeAddressDto traineeAddressDto) {
	TraineeAddressEntity traineeAddressEntity= this.gettraineeAddressEntity(traineeAddressDto);
	trineeAddressDao.addTrainee(traineeAddressEntity);
	
	return null;
}

@Override
public TraineeAddressDto updatTraineeAddress(TraineeAddressDto traineeAddressDto) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public TraineeAddressDto deleteTraineeAddress(TraineeAddressDto traineeAddressDto) {
	// TODO Auto-generated method stub
	return null;
}
public TraineeAddressEntity gettraineeAddressEntity(TraineeAddressDto traineeAddressDto){
	TraineeAddressEntity traineeAddressEntity=new TraineeAddressEntity();
	traineeAddressEntity.setCurrentAddress(traineeAddressDto.getCurrentAddress());
	
	return null;
}
}