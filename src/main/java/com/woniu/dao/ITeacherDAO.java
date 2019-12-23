package com.woniu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Exam;
import com.woniu.pojo.Grade;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;

public interface ITeacherDAO {
	
	//根据学生id查询学生
	Student studentfindOneById(Integer id);
	//查询考勤记录表
	List<Chrecord> findAllChrecord();
	//查询考试记录表
	List<Exam> finAllExam();
	//查询班级表
	List<Grade> findAllGrade();
	//查询阶段表
	List<Stage> findAllStage();
	//查询学生表
	List<Student> findAllStudent();
	//更改自己账户的信息
	void updateUser(User user);
}
