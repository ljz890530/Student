package com.woniu.pojo;
// Generated 2019-12-18 17:47:01 by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * Exam generated by hbm2java
 */
public class Exam implements java.io.Serializable {

	private Integer eid;
	private Stage stage;
	private Student student;
	private Integer escore;
	private Date edate;

	public Exam() {
	}

	public Exam(Stage stage, Student student, Integer escore, Date edate) {
		this.stage = stage;
		this.student = student;
		this.escore = escore;
		this.edate = edate;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Stage getStage() {
		return this.stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getEscore() {
		return this.escore;
	}

	public void setEscore(Integer escore) {
		this.escore = escore;
	}

	public Date getEdate() {
		return this.edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

}