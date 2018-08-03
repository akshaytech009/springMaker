package com.nucleus.model.persistence.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nucleus.model.persistence.entity.User;
@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	@Override
	public boolean validate(String name, String pass) {
	Session currentSession=sessionFactory.getCurrentSession();
	
	Query q = currentSession
			.createQuery("select u from User u where u.userName=:name and u.password=:password");
	q.setString("name", name);
	q.setString("password", pass);

	@SuppressWarnings("unchecked")
	List<User> list = q.list();
	if (!list.isEmpty()) {
		System.out.println("something is found!");
		User user = list.get(0);
		System.out.println(user);
		
		return true;
		
	} else {
		System.out.println("user not found");
	}
	
	return false;
		
	}
	@Transactional
	@Override
	public User getUser(String userName, String userPassword) {
		Session currentSession=sessionFactory.getCurrentSession();
	
		Query q = currentSession
				.createQuery("select u from User u where u.userName=:userName and u.password=:userPassword");
		q.setParameter("userName", userName);
		q.setParameter("userPassword",userPassword);
		System.out.println(userName+userPassword);
		@SuppressWarnings("unchecked")
		List<User> users=q.list();
		if(!users.isEmpty()){
			User userinfo=users.get(0);
			return userinfo;}
			else
		return null;
	}
	
}
