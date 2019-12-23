package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ITeacherDAO;
import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Exam;
import com.woniu.pojo.Grade;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;

@Repository
public class TeacherDAOImpl implements ITeacherDAO{

	@Autowired
	SessionFactory sf;
	@SuppressWarnings("unchecked")
	@Override
	public List<Chrecord> findAllChrecord() {
		return sf.getCurrentSession().createSQLQuery("select * from chrecord").addEntity(Chrecord.class).list();
	}
	@SuppressWarnings("unchecked")
	public List<Exam> finAllExam(){
		return sf.getCurrentSession().createSQLQuery("select * from exam").addEntity(Exam.class).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Grade> findAllGrade() {
		return sf.getCurrentSession().createSQLQuery("select * from grade").addEntity(Grade.class).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Stage> findAllStage() {
		return sf.getCurrentSession().createSQLQuery("select * from stage").addEntity(Stage.class).list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAllStudent() {
		return sf.getCurrentSession().createSQLQuery("select * from student").addEntity(Student.class).list();
	}
	@Override
	public Student studentfindOneById(Integer id) {
		return (Student) sf.openSession().createSQLQuery("select * from student where stuId=?").setParameter(1, id).addEntity(Student.class).list().get(0);
	}

	@Override
	public void updateUser(User user) {
		sf.getCurrentSession().update(user);
	}
}
