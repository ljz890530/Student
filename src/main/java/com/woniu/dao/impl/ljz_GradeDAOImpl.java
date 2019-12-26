package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ljz_IGradeDAO;
import com.woniu.pojo.Grade;
@Repository
public class ljz_GradeDAOImpl implements ljz_IGradeDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	//修改
	@Override
	public void update(Grade grade) {
		sessionFactory.getCurrentSession().update(grade);
	}

	//通过gid找一个grade对象
	@Override
	public Grade findOne(Integer gId) {
		return sessionFactory.getCurrentSession().get(Grade.class, gId);
	}
	
	@Override
	public List<Grade> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Grade.class).list();
	}

}
