package com.tclabs.trainee.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tclabs.trainee.dao.ITraineeDao;
import com.tclabs.trainee.dto.TraineeDto;
import com.tclabs.trainee.model.TraineeEntity;
import com.tclabs.trainee.service.ITraineeInfoService;
@Service("traineeInfoServiceImpl")
public class TraineeInfoServiceImpl implements ITraineeInfoService{
	@Autowired
	@Qualifier("traineeDaoImpl")
	ITraineeDao iTraineeDao;
	
	
@Transactional
@Override
public TraineeEntity registerTrainee(TraineeDto traineeDto) {
	TraineeEntity traineeEntity=iTraineeDao.register(this.getEntity(traineeDto));
	return traineeEntity;
}
public TraineeEntity getEntity(TraineeDto trineeDto){
	TraineeEntity trineeEntity=new TraineeEntity(trineeDto.getId(), trineeDto.getFullname(), trineeDto.getGender(), trineeDto.getContactNumber(), trineeDto.getMobileNumber(), trineeDto.getBirthDate());
return trineeEntity;
}
	
}
