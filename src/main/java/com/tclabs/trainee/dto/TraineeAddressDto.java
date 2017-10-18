package com.tclabs.trainee.dto;

import com.tclabs.trainee.model.TraineeEntity;

public class TraineeAddressDto {
	private long id;
	private String currentAddress;
	private String PerminentAddress;
	private long pincode;
	private TraineeEntity traineeEntity;
	public TraineeAddressDto() {
		// TODO Auto-generated constructor stub
	}
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPerminentAddress() {
		return PerminentAddress;
	}
	public void setPerminentAddress(String perminentAddress) {
		PerminentAddress = perminentAddress;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public TraineeEntity getTraineeEntity() {
		return traineeEntity;
	}
	public void setTraineeEntity(TraineeEntity traineeEntity) {
		this.traineeEntity = traineeEntity;
	}
	@Override
	public String toString() {
		return "TraineeAddressDto [id=" + id + ", currentAddress="
				+ currentAddress + ", PerminentAddress=" + PerminentAddress
				+ ", pincode=" + pincode + ", traineeEntity=" + traineeEntity
				+ "]";
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
		
}
