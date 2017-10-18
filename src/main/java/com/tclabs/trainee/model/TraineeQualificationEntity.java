package com.tclabs.trainee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINEE_QUALIFICATION")
public class TraineeQualificationEntity {
	
	private long id;
	private String qualification;
	private String univarsity;
	private float percentage;
	private String yearOfPass;
	private TraineeEntity traineeEntity;

	public TraineeQualificationEntity() {
		// TODO Auto-generated constructor stub
	}

	
	public TraineeQualificationEntity(long id, String qualification,
			String univarsity, float percentage, String yearOfPass,
			TraineeEntity traineeEntity) {
		super();
		this.id = id;
		this.qualification = qualification;
		this.univarsity = univarsity;
		this.percentage = percentage;
		this.yearOfPass = yearOfPass;
		this.traineeEntity = traineeEntity;
	}


	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "TRAINEE_ID")
	public TraineeEntity getTraineeEntity() {
		return traineeEntity;
	}

	public void setTraineeEntity(TraineeEntity traineeEntity) {
		this.traineeEntity = traineeEntity;
	}

	@Column(name = "QUALIFICATION")
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Column(name = "UNIVERSITY")
	public String getUnivarsity() {
		return univarsity;
	}

	public void setUnivarsity(String univarsity) {
		this.univarsity = univarsity;
	}

	@Column(name = "PERCENTAGE")
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Column(name = "YEAR_OF_PASS")
	public String getYearOfPass() {
		return yearOfPass;
	}


	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	
	
}
