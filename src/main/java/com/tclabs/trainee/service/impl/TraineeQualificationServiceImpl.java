package com.tclabs.trainee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tclabs.trainee.dao.TraineeQualificationDao;
import com.tclabs.trainee.dto.TraineeQualificationDto;
import com.tclabs.trainee.model.TraineeQualificationEntity;
import com.tclabs.trainee.service.ITraineeQualificationService;

@Service("traineeQualificationServiceImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class TraineeQualificationServiceImpl implements ITraineeQualificationService {

	@Autowired
	@Qualifier("traineeQualificationDaoImpl")
	TraineeQualificationDao traineeQualificationDao;

	@Override
	public boolean saveTraineeQly(TraineeQualificationDto trineQualificationDto) {
		traineeQualificationDao.saveTrainee(this
				.getcanditEntity(trineQualificationDto));
		return false;

	}

	
	public TraineeQualificationEntity getcanditEntity(TraineeQualificationDto trineQualificationDto) {
		TraineeQualificationEntity trineQualification = new TraineeQualificationEntity(
				trineQualificationDto.getId(),
				trineQualificationDto.getQualification(),
				trineQualificationDto.getUnivarsity(),
				trineQualificationDto.getPercentage(),
				trineQualificationDto.getYearOfPass(),trineQualificationDto.getTraineeEntity());
		return trineQualification;
	}
}