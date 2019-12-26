package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IStuDAO;
import com.woniu.pojo.Student;
@Repository
public class StuDAOImpl implements IStuDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Student obj) {
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void delete(Student obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Override
	public void update(Student obj) {
		sessionFactory.getCurrentSession().update(obj);
	}

	@Override
	public Student findOne(Integer id) {
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Student.class).list();
	}

}
