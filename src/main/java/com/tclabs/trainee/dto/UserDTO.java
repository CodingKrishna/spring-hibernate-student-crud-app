package com.tclabs.trainee.dto;

public class UserDTO {

	private String userName;
	private String email;
	private String phoneNum;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String userName, String email, String phoneNum) {
		super();
		this.userName = userName;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", email=" + email
				+ ", phoneNum=" + phoneNum + "]";
	}
	
	
}
