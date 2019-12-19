package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;


public interface IUserDAO {
	void save(User user);
	void update(User user);
	void delete(User user);
	User findOne(User user);
	List<User> findAll();
}
