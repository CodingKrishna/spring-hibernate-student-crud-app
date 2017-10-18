package com.tclabs.trainee.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tclabs.trainee.dao.ITraineeDao;
import com.tclabs.trainee.model.TraineeEntity;

@Repository("traineeDaoImpl")
public class TraineeDaoImpl implements ITraineeDao {
	@Autowired
	SessionFactory sessionFactory;
    
	public TraineeEntity register(TraineeEntity traineeEntity) {
		Session session = sessionFactory.getCurrentSession();
		long id=(Long)session.save(traineeEntity);
		System.out.println(id);
		traineeEntity.setId(id);
		if(id!=0){
			return traineeEntity;
		}
		else{
			return traineeEntity;
		}
		
	}
	
}
