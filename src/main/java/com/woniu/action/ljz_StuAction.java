package com.woniu.action;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Grade;
import com.woniu.pojo.Student;
import com.woniu.service.ljz_IGradeService;
import com.woniu.service.ljz_IStuService;

@Controller
public class ljz_StuAction {
	@Autowired
	 private ljz_IStuService is;
	@Autowired
	 private ljz_IGradeService ig;
	 private Student stu;
	 private List<Student> stus;
	 private List<Grade> grades;
	 
	 
	 public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	//����ѧ����Ϣ
	 public String addStu() {
		 is.save(stu);
		 return "success";
	 }
	 
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Grade;
import com.woniu.pojo.Student;
import com.woniu.service.ljz_IGradeService;
import com.woniu.service.ljz_IStuService;

@Controller
public class ljz_StuAction {
	@Autowired
	 private ljz_IStuService is;
	@Autowired
	 private ljz_IGradeService ig;
	 private Student stu;
	 private List<Student> stus;
	 private List<Grade> grades;
	 
	 
	 public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	//����ѧ����Ϣ
	 public String addStu() {
		 is.save(stu);
		 return "success";
	 }
	 //��ʾ���ѧ����༶�������б�
	 public String listGradeName() {
		 grades = ig.findAll();//�ҵ����а༶��ҳ��
		 return "success";
	 }
>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
	 //�鿴����ѧ����Ϣ
	 public String showAllStu() {
		 grades = ig.findAll();
		 stus = is.findAll();
		 return "success";
	 }
}
