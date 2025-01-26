package com.MealDash.model;

import java.time.LocalDateTime;

public class User {

	private int userId;
	private String name;
	private String email;
	private long phoneNumber;
	private String address;
	private String userName;
	private String password;
	private String role;
	private LocalDateTime createdDate;
	private LocalDateTime lastLoginDate;
	
	
	public User() {
		
	}
	
	public User(int userId, String name, String email, long phoneNumber, String address, String userName, String password, String role, LocalDateTime createdDate, LocalDateTime lastLoginDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address =  address;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.createdDate = createdDate ;
		this.lastLoginDate = lastLoginDate;
	}
	
	  public User(String name, String username, String email, long phoneNumber, String address, String password) {
	        this.name = name;
	        this.userName = username;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.password = password;
	    }
	public int getUserId()  {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public LocalDateTime getLastLoginDate() {
		return lastLoginDate;
	}
	
	public void setLastLoginDate(LocalDateTime lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ ", createdDate=" + createdDate.getDayOfMonth() + " " + createdDate.getMonth() +  " " + createdDate.getYear() 
				+  ", lastLoginDate=" + lastLoginDate.getDayOfMonth() + " " + lastLoginDate.getMonth() + " " + lastLoginDate.getYear() + "]";
	}
	

	
}
