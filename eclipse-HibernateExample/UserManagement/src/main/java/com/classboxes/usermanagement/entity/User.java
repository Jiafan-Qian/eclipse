package com.classboxes.usermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "useremail")
	private String userEmail;
	
	@Column(name = "country")
	private String country;

	public User(String userName, String userEmail, String country) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.country = country;
	}

	public User() {
		super();
	}

	public User(int userId, String userName, String userEmail, String country) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}

