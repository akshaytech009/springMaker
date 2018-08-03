package com.nucleus.model.persistence.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User_1227")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="User_Name")
	private String userName;
	@Column(name="password")
	private String password;
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
private Profile profile;
	public User(){};
	
	public User(String userName, String password, Profile profile) {
		super();
		this.userName = userName;
		this.password = password;
		this.profile = profile;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}


}

