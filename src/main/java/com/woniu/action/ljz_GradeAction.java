package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Grade;
import com.woniu.pojo.Student;
import com.woniu.service.ljz_IGradeService;
import com.woniu.service.ljz_IStuService;

@Controller
public class ljz_GradeAction {
	@Autowired
	ljz_IGradeService ig;
	@Autowired
	ljz_IStuService is;
	
	private Grade grade;
	private List<Grade> grades;
	private Integer stugId;
	private Integer gradeId;
	
	
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getStugId() {
		return stugId;
	}
	public void setStugId(Integer stugId) {
		this.stugId = stugId;
	}
	public ljz_IGradeService getIg() {
		return ig;
	}
	public void setIg(ljz_IGradeService ig) {
		this.ig = ig;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	
	//��ʾ���а༶��Ϣע��ҳ��
	public String listGrade() {
		grades = ig.findAll();
		return "success";
	}
	
	//�޸İ༶id
	public String updGrade() {
		Student stu = is.findOne(stugId);//���������stuId��ѧ������
		System.out.println(stu);
		stu.setGid(gradeId);//�����б�ѡ�е�gid
		System.out.println(stu);
		is.update(stu);
		return "success";
	}
	
	
}
