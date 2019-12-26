package com.woniu.pojo;
// Generated 2019-12-18 17:47:01 by Hibernate Tools 5.4.7.Final

import java.util.Date;


public class Chrecord implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer chReId;
	private Check check;
	private Student student;
	private Date chReTime;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Chrecord() {
	}

	public Chrecord(Integer chReId, Check check, Student student, Date chReTime) {
		super();
		this.chReId = chReId;
		this.check = check;
		this.student = student;
		this.chReTime = chReTime;
	}

	public Integer getChReId() {
		return chReId;
	}

	public void setChReId(Integer chReId) {
		this.chReId = chReId;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getChReTime() {
		return chReTime;
	}

	public void setChReTime(Date chReTime) {
		this.chReTime = chReTime;
	}

	@Override
	public String toString() {
		return "Chrecord [chReId=" + chReId + ", check=" + check + ", student=" + student + ", chReTime=" + chReTime
				+ "]";
	}

	
	

}
