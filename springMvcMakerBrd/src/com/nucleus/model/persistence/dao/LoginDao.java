package com.nucleus.model.persistence.dao;

import com.nucleus.model.persistence.entity.User;;

public interface LoginDao {
	public  boolean validate(String name,String pass);
	 public User getUser(String userName,String userPassword);
}
