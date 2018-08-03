package com.nucleus.model.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profile_1227")
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(nullable=false, unique=true)
	private int id;

	private String profile;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Profile(String profile, String description) {
		super();
		this.profile = profile;
		this.description = description;
	}
	public Profile() {
		super();
		
	}





}

