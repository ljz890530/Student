package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Student;
import com.woniu.service.IStuService;

@Controller
public class StuAction {
	@Autowired
	 private IStuService is;
	 private Student stu;
	 
	 public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	//增加学生信息
	 public String addStu() {
		 System.out.println(stu);
		 is.save(stu);
		 return "success";
	 }
}
