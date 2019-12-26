package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Student;


public interface ljz_IStuDAO {
	void save(Student obj);
	void delete(Student obj);
	void update(Student obj);
	void marge(Student obj);
	Student findOne(Integer id);
	List<Student> findAll();
}
