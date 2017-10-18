package com.tclabs.trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TRAINEE_CONTACT_INFO")
public class TraineeEntity {
	private long id;
	private String fullname;
	private String gender;
	private long ContactNumber;
	private long mobileNumber;
	private String birthDate;

	public TraineeEntity() {
		// TODO Auto-generated constructor stub
	}
	

	public TraineeEntity(long id, String fullname, String gender,
			long contactNumber, long mobileNumber, String birthDate) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		ContactNumber = contactNumber;
		this.mobileNumber = mobileNumber;
		this.birthDate = birthDate;
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

	@Column(name = "FULL_NAME")
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "GENDER")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	@Column(name = "CONTACT_NUMBER",unique = true)
	public long getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}

	@Column(name = "MOBILE_NUMBER", unique = true)
	
	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "BIRTH_DATE")
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

}
