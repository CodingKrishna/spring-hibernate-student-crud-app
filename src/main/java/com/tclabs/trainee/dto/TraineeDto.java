package com.tclabs.trainee.dto;
public class TraineeDto {
private long id;
private String fullname;
private String gender;
private long ContactNumber;
private long mobileNumber;
private String birthDate;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getContactNumber() {
	return ContactNumber;
}
public void setContactNumber(long contactNumber) {
	ContactNumber = contactNumber;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
@Override
public String toString() {
	return "Candit [id=" + id + ", fullname=" + fullname + ", gender=" + gender
			+ ", ContactNumber=" + ContactNumber + ", mobileNumber="
			+ mobileNumber + ", birthDate=" + birthDate + "]";
}



}
