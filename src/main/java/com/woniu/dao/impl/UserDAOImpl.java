package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
@Repository
public class UserDAOImpl implements IUserDAO{
	
	@Autowired
	SessionFactory sessionFctory;
	@Override
	public void save(User user) {
		sessionFctory.openSession().save(user);
	}

	@Override
	public List<User> findAll() {
		return sessionFctory.openSession().createCriteria(User.class).list();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
}
