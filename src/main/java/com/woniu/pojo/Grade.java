package com.woniu.pojo;
// Generated 2019-12-18 17:47:01 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Grade generated by hbm2java
 */
public class Grade implements java.io.Serializable {

	private Integer gid;
	private Stage stage;
<<<<<<< HEAD
	private Integer hId;
	private Integer tId;
	private String gtype;
	private String gname;
	private Set students = new HashSet(0);

	public Grade() {
	}

	public Grade(Integer gid, Stage stage, Integer hId, Integer tId, String gtype, String gname, Set students) {
		super();
		this.gid = gid;
		this.stage = stage;
		this.hId = hId;
		this.tId = tId;
		this.gtype = gtype;
		this.gname = gname;
		this.students = students;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Integer gethId() {
		return hId;
	}

	public void sethId(Integer hId) {
		this.hId = hId;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public Set getStudents() {
		return students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", stage=" + stage + ", hId=" + hId + ", tId=" + tId + ", gtype=" + gtype
				+ ", gname=" + gname + ", students=" + students + "]";
	}

	
	

	
=======
	private User userByHid;
	private User userByTid;
	private String gtype;
	private String gname;
	private Set students = new HashSet(0);

	public Grade() {
	}

	public Grade(Stage stage, User userByHid, User userByTid, String gtype, String gname, Set students) {
		this.stage = stage;
		this.userByHid = userByHid;
		this.userByTid = userByTid;
		this.gtype = gtype;
		this.gname = gname;
		this.students = students;
	}

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Stage getStage() {
		return this.stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public User getUserByHid() {
		return this.userByHid;
	}

	public void setUserByHid(User userByHid) {
		this.userByHid = userByHid;
	}

	public User getUserByTid() {
		return this.userByTid;
	}

	public void setUserByTid(User userByTid) {
		this.userByTid = userByTid;
	}

	public String getGtype() {
		return this.gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	public String getGname() {
		return this.gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
}
