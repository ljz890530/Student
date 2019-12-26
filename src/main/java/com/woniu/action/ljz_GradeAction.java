package com.woniu.action;

<<<<<<< HEAD
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
	private Integer stuId;//����showҳ�洫������stuId
	private Integer stugId;//����showҳ�洫������stugId
	private Integer gradeId;
	
	
	public Integer getStugId() {
		return stugId;
	}
	public void setStugId(Integer stugId) {
		this.stugId = stugId;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
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
		Student stu = is.findOne(stuId);//���������stuId��ѧ������
		//stu.setGid(gradeId);//�����б�ѡ�е�gid
		is.update(stu);
		return "success";
	}
	
=======
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
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
	private Integer stuId;//����showҳ�洫������stuId
	private Integer stugId;//����showҳ�洫������stugId
	private Integer gradeId;
	private String stuExcelFileName;
	private File stuExcel;
	
	
	public String getStuExcelFileName() {
		return stuExcelFileName;
	}
	public void setStuExcelFileName(String stuExcelFileName) {
		this.stuExcelFileName = stuExcelFileName;
	}
	public File getStuExcel() {
		return stuExcel;
	}
	public void setStuExcel(File stuExcel) {
		this.stuExcel = stuExcel;
	}
	public Integer getStugId() {
		return stugId;
	}
	public void setStugId(Integer stugId) {
		this.stugId = stugId;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
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
		Student stu = is.findOne(stuId);//���������stuId��ѧ������
		stu.setGid(gradeId);//�����б�ѡ�е�gid
		is.update(stu);
		return "success";
	}
	
	//excel����ѧ��
	public String stuExcel() {
		System.out.println(stuExcelFileName);
		System.out.println(stuExcel);
		
		String realPath = ServletActionContext.getServletContext().getRealPath("/uploadExcel");
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		//����ϴ��ļ��ĺ�׺
		String suffix = stuExcelFileName.substring(stuExcelFileName.lastIndexOf(".")); 
		//����ϴ��ļ������ƣ������ظ���
		String fName = UUID.randomUUID()+suffix;
		
		//�ϴ��ļ�
		try {
			FileUtils.copyFile(stuExcel,new File(file,fName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ig.stuExcel(file+"/"+fName);
		return "success";
	}

>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
	
}
