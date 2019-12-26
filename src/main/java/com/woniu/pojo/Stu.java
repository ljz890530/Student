package com.woniu.pojo;

import java.io.Serializable;

public class Stu implements Serializable {
	private Integer stuId;
	private Grade grade;
	private String stuName;
	private String stuSex;
	private String stuCard;
	private String inTime;
	private String outTime;
	private String stuPhone;
	private String stuAdd;
	private String stuEdu;
	private String stuCollege;
	private String stuMajor;
	private String stuGradu;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuCard() {
		return stuCard;
	}
	public void setStuCard(String stuCard) {
		this.stuCard = stuCard;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuEdu() {
		return stuEdu;
	}
	public void setStuEdu(String stuEdu) {
		this.stuEdu = stuEdu;
	}
	public String getStuCollege() {
		return stuCollege;
	}
	public void setStuCollege(String stuCollege) {
		this.stuCollege = stuCollege;
	}
	public String getStuMajor() {
		return stuMajor;
	}
	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}
	public String getStuGradu() {
		return stuGradu;
	}
	public void setStuGradu(String stuGradu) {
		this.stuGradu = stuGradu;
	}
	@Override
	public String toString() {
		return "Stu [stuId=" + stuId + ", grade=" + grade + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuCard="
				+ stuCard + ", inTime=" + inTime + ", outTime=" + outTime + ", stuPhone=" + stuPhone + ", stuAdd="
				+ stuAdd + ", stuEdu=" + stuEdu + ", stuCollege=" + stuCollege + ", stuMajor=" + stuMajor
				+ ", stuGradu=" + stuGradu + "]";
	}
	
}
