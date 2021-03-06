package com.woniu.pojo;
<<<<<<< HEAD
// Generated 2019-12-18 17:47:01 by Hibernate Tools 5.4.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer stuId;
	private Grade grade;
	private String stuName;
	private String stuSex;
	private String stuCard;
	private Date inTime;
	private Date outTime;
	private String stuPhone;
	private String stuAdd;
	private String stuEdu;
	private String stuCollege;
	private String stuMajor;
	private String stuGradu;
	private Set exams = new HashSet(0);

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Student() {
	}

	

	public Student(Integer stuId, Grade grade, String stuName, String stuSex, String stuCard, Date inTime, Date outTime,
			String stuPhone, String stuAdd, String stuEdu, String stuCollege, String stuMajor, String stuGradu,
			Set exams) {
		super();
		this.stuId = stuId;
		this.grade = grade;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuCard = stuCard;
		this.inTime = inTime;
		this.outTime = outTime;
		this.stuPhone = stuPhone;
		this.stuAdd = stuAdd;
		this.stuEdu = stuEdu;
		this.stuCollege = stuCollege;
		this.stuMajor = stuMajor;
		this.stuGradu = stuGradu;
		this.exams = exams;
	}



	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuCard() {
		return this.stuCard;
	}

	public void setStuCard(String stuCard) {
		this.stuCard = stuCard;
	}

	public Date getInTime() {
		return this.inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return this.outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public String getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getStuAdd() {
		return this.stuAdd;
	}

	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}

	public String getStuEdu() {
		return this.stuEdu;
	}

	public void setStuEdu(String stuEdu) {
		this.stuEdu = stuEdu;
	}

	public String getStuCollege() {
		return this.stuCollege;
	}

	public void setStuCollege(String stuCollege) {
		this.stuCollege = stuCollege;
	}

	public String getStuMajor() {
		return this.stuMajor;
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



	public Set getExams() {
		return this.exams;
	}

	public void setExams(Set exams) {
		this.exams = exams;
	}



	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}




	

	

	
	

=======
// Generated 2019-12-20 10:30:55 by Hibernate Tools 5.4.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private Integer stuId;
	private String stuName;
	private String stuSex;
	private String stuCard;
	private Date inTime;
	private Date outTime;
	private String stuPhone;
	private String stuAdd;
	private String stuEdu;
	private String stuCollege;
	private String stuMajor;
	private Date stuGradu;
	private Integer gid;
	private Set chrecords = new HashSet(0);

	public Student() {
	}

	public Student(String stuName, String stuSex, String stuCard, Date inTime, Date outTime, String stuPhone,
			String stuAdd, String stuEdu, String stuCollege, String stuMajor, Date stuGradu, Integer gid,
			Set chrecords) {
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuCard = stuCard;
		this.inTime = inTime;
		this.outTime = outTime;
		this.stuPhone = stuPhone;
		this.stuAdd = stuAdd;
		this.stuEdu = stuEdu;
		this.stuCollege = stuCollege;
		this.stuMajor = stuMajor;
		this.stuGradu = stuGradu;
		this.gid = gid;
		this.chrecords = chrecords;
	}

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuCard() {
		return this.stuCard;
	}

	public void setStuCard(String stuCard) {
		this.stuCard = stuCard;
	}

	public Date getInTime() {
		return this.inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return this.outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public String getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getStuAdd() {
		return this.stuAdd;
	}

	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}

	public String getStuEdu() {
		return this.stuEdu;
	}

	public void setStuEdu(String stuEdu) {
		this.stuEdu = stuEdu;
	}

	public String getStuCollege() {
		return this.stuCollege;
	}

	public void setStuCollege(String stuCollege) {
		this.stuCollege = stuCollege;
	}

	public String getStuMajor() {
		return this.stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public Date getStuGradu() {
		return this.stuGradu;
	}

	public void setStuGradu(Date stuGradu) {
		this.stuGradu = stuGradu;
	}

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Set getChrecords() {
		return this.chrecords;
	}

	public void setChrecords(Set chrecords) {
		this.chrecords = chrecords;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuCard=" + stuCard
				+ ", inTime=" + inTime + ", outTime=" + outTime + ", stuPhone=" + stuPhone + ", stuAdd=" + stuAdd
				+ ", stuEdu=" + stuEdu + ", stuCollege=" + stuCollege + ", stuMajor=" + stuMajor + ", stuGradu="
				+ stuGradu + ", gid=" + gid + ", chrecords=" + chrecords + "]";
	}
	
>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
}
