package com.tclabs.trainee.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tclabs.trainee.dao.TraineeAddressDao;
import com.tclabs.trainee.model.TraineeAddressEntity;
@Repository(value="traineeAddressDaoImpl")
public class TraineeAddressDaoImpl implements TraineeAddressDao {
  
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public TraineeAddressEntity addTrainee(
			TraineeAddressEntity traineeAddressEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTrainee(TraineeAddressEntity traineeAddressEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTrainee(TraineeAddressEntity traineeAddressEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}
