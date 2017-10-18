package com.tclabs.trainee.dto;

import com.tclabs.trainee.model.TraineeEntity;

public class TraineeQualificationDto {
	private long id;
	private String qualification;
	private String univarsity;
	private float percentage;
	private String yearOfPass;
	private TraineeEntity traineeEntity;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TraineeEntity getTraineeEntity() {
		return traineeEntity;
	}

	public void setTraineeEntity(TraineeEntity traineeEntity) {
		this.traineeEntity = traineeEntity;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUnivarsity() {
		return univarsity;
	}

	public void setUnivarsity(String univarsity) {
		this.univarsity = univarsity;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

	@Override
	public String toString() {
		return "CanditQualificationDto [qualification=" + qualification
				+ ", univarsity=" + univarsity + ", percentage=" + percentage
				+ ", yearOfPass=" + yearOfPass + "]";
	}

}
