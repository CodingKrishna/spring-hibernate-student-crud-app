package com.tclabs.trainee.dao;

import com.tclabs.trainee.model.TraineeAddressEntity;


public interface TraineeAddressDao {

	public TraineeAddressEntity addTrainee(TraineeAddressEntity traineeAddressEntity);
	public boolean updateTrainee( TraineeAddressEntity traineeAddressEntity);
	public boolean deleteTrainee(TraineeAddressEntity traineeAddressEntity);
}
