package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Check;
import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Student;
import com.woniu.service.ljz_ICheckRecordService;
import com.woniu.service.ljz_ICheckService;

@Controller
public class ljz_CheckAction {
	
	@Autowired
	private ljz_ICheckService ick;
	@Autowired
	private ljz_ICheckRecordService icr;
	
	private Check check;
	private List<Check> checks;
	private Student stu;
	private Chrecord chrecord;
	private List<Chrecord> chrecords;
	private Integer stuId;
	
	
	public List<Chrecord> getChrecords() {
		return chrecords;
	}
	public void setChrecords(List<Chrecord> chrecords) {
		this.chrecords = chrecords;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public Chrecord getChrecord() {
		return chrecord;
	}
	public void setChrecord(Chrecord chrecord) {
		this.chrecord = chrecord;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public Check getCheck() {
		return check;
	}
	public void setCheck(Check check) {
		this.check = check;
	}
		
	public List<Check> getChecks() {
		return checks;
	}
	public void setChecks(List<Check> checks) {
		this.checks = checks;
	}
	
	public String getCheckName() {
		checks = ick.findAll();
		return "success";
	}
	
	public String saveCheckRecord() {
		
		Chrecord cord = new Chrecord();
		Student stu2= new Student();
		
		cord.setChId(check.getChId());
		stu2.setStuId(stuId);
		
		System.out.println(stu);
		cord.setStudent(stu2);
		icr.save(cord);
		return "success";
	}
	
	public String showCheckRecord() {
		chrecords = icr.findAll(stuId);
		return "success";
	}
}
