package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ljz_ICheckDAO;
import com.woniu.pojo.Check;
@Repository
public class ljz_CheckDAOImpl implements ljz_ICheckDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Override
	public Check findOne(Integer chId) {
		return sessionFactory.getCurrentSession().get(Check.class, chId);
	}


	@Override
	public List<Check> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Check.class).list();
	}
	
}
