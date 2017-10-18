package com.tclabs.trainee.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tclabs.trainee.dao.TraineeQualificationDao;
import com.tclabs.trainee.model.TraineeQualificationEntity;

@Repository("traineeQualificationDaoImpl")
public class TraineeQualificationDaoImpl implements TraineeQualificationDao  {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveTrainee(TraineeQualificationEntity traineeQualificationEntity) {
		Session session = sessionFactory.getCurrentSession();
		Long id = (Long) session.save(traineeQualificationEntity);
		if (id != 0) {
			return true;
		}
		return false;
	}
}
