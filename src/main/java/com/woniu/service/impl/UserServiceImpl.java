package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDAO;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDAO userDAO;
	
	@Override
	public void save(User obj) {
		userDAO.save(obj);
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public User findOne(User user) {
		// TODO Auto-generated method stub
		User u = userDAO.findOne(user);
		return u;
	}

}
