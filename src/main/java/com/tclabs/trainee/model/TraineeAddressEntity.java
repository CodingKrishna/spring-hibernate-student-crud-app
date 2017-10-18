package com.tclabs.trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINEE_ADDRESS")
public class TraineeAddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	@Column(name = "CURRENT_ADDRESS")
	private String currentAddress;
	@Column(name = "PERMINENT_ADDRESS")
	private String PerminentAddress;
	@Column(name = "PINCODE")
	private long pincode;
	@ManyToOne
	@JoinColumn(name = "TRAINEE_ID")
	private TraineeEntity traineeEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
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
		return "AddressEntity [id=" + id + ", currentAddress=" + currentAddress
				+ ", PerminentAddress=" + PerminentAddress + ", pincode="
				+ pincode + ", traineeEntity=" + traineeEntity + "]";
	}

}
