package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Student;

public interface ljz_IStuService {
	void save(Student stu);
	void delete(Student stu);
	void update(Student stu);
	void merge(Student stu);
	Student findOne(Integer id);
	List<Student> findAll(); 
}
