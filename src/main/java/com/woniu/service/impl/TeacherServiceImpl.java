package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ITeacherDAO;
import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Exam;
import com.woniu.pojo.Grade;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.service.ITeacherService;


@Service
@Transactional
public class TeacherServiceImpl implements ITeacherService{

	@Autowired
	ITeacherDAO td;
	@Override
	public List<Chrecord> findAllChrecord() {
		return td.findAllChrecord();
	}
	@Override
	public List<Exam> finAllExam() {
		return td.finAllExam();
	}
	@Override
	public List<Grade> findAllGrade() {
		return td.findAllGrade();
	}
	@Override
	public List<Stage> findAllStage() {
		return td.findAllStage();
	}
	@Override
	public List<Student> findAllStudent() {
		return td.findAllStudent();
	}
	@Override
	public Student studentfindOneById(Integer id) {
		return td.studentfindOneById(id);
	}
	@Override
	public void updateUser(User user) {
		td.updateUser(user);
	}

}
