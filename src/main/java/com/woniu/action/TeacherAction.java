package com.woniu.action;


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Exam;
import com.woniu.pojo.Grade;
import com.woniu.pojo.Stage;
import com.woniu.pojo.Stu;
import com.woniu.pojo.Student;
import com.woniu.pojo.User;
import com.woniu.service.ITeacherService;
import com.woniu.service.IUserService;

@Controller
public class TeacherAction {
	private User user;
	@Autowired
	private ITeacherService ts;
	@Autowired
	private IUserService us;
	
	
	private Student student;
	private List<Chrecord> chrecords;
	private List<Exam> exams;
	private List<User> users;
	private List<Grade> grades;
	private List<Stage> stages;
	private List<Student> students;
	
	//获取页面的学生id----变量
	Integer id;
	String stu1;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getStu1() {
		return stu1;
	}
	public void setStu1(String stu1) {
		this.stu1 = stu1;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Stage> getStages() {
		return stages;
	}
	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	public List<Chrecord> getChrecords() {
		return chrecords;
	}
	public void setChrecords(List<Chrecord> chrecords) {
		this.chrecords = chrecords;
	}
	public List<Exam> getExams() {
		return exams;
	}
	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}
	//查询全部考勤记录
	public String findAllChrecord() {
		chrecords=ts.findAllChrecord();
		Integer count=0;//正常
		Integer late=0;//迟到
		Integer early=0;//早退
		Integer leave=0;//请假
		Integer sickness=0;//生病
		Integer truant=0;//旷课
		for (Chrecord chrecord : chrecords) {
			//System.out.println(chrecord+"====================");
			if (chrecord.getCheck().getChName().equalsIgnoreCase("正常")) {
				count++;
			}
			if (chrecord.getCheck().getChName().equalsIgnoreCase("迟到")) {
				late++;
			}
			if (chrecord.getCheck().getChName().equalsIgnoreCase("早退")) {
				early++;
			}
			if (chrecord.getCheck().getChName().equalsIgnoreCase("请假")) {
				leave++;
			}
			if (chrecord.getCheck().getChName().equalsIgnoreCase("生病")) {
				sickness++;
			}
			if (chrecord.getCheck().getChName().equalsIgnoreCase("旷课")) {
				truant++;
			}
		}
		System.out.println("正常:"+count+"");
		System.out.println("迟到:"+late+"");
		System.out.println("早退:"+early+"");
		System.out.println("请假:"+leave+"");
		System.out.println("生病:"+sickness+"");
		System.out.println("旷课:"+truant+"");
		//把迟到早退正常-----发送到页面显示
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("count",count);
		session.setAttribute("late",late);
		session.setAttribute("early",early);
		session.setAttribute("leave",leave);
		session.setAttribute("sickness",sickness);
		session.setAttribute("truant",truant);
		return "success";
	}
	//查询全部考试信息
	public String findAllExam() {
		exams=ts.finAllExam();
		System.out.println(exams);
		return "success";
	}
	//查询全部学生信息
	public String findAllStudentInfo() {
		grades=ts.findAllGrade();
		stages=ts.findAllStage();
		students=ts.findAllStudent();
//		System.out.println(grades);
//		System.out.println(stages);
//		System.out.println(students);
		return "success";
	}
	
	//根据页面ajax的请求(发送的学生id,返回去所有的信息)
	public String studentInfo() {
		Student student=ts.studentfindOneById(id);
		Stu stu=new Stu();
		stu.setStuId(student.getStuId());
		stu.setStuName(student.getStuName());
		stu.setStuSex(student.getStuSex());
		stu.setStuCard(student.getStuCard());
		//stu.setGrade(student.getGrade());
		stu.setInTime(student.getInTime()+"");
		stu.setOutTime(student.getOutTime()+"");
		stu.setStuPhone(student.getStuPhone());
		stu.setStuAdd(student.getStuAdd());
		stu.setStuEdu(student.getStuEdu());
		stu.setStuCollege(student.getStuCollege());
		//stu.setStuGradu(student.getStuGradu());
		//System.out.println(stu);
		
		ObjectMapper mapper=new ObjectMapper();	
		PrintWriter pw=null;
		stu1=null;
		try {
			stu1 = mapper.writeValueAsString(stu);	
		    HttpServletResponse response = ServletActionContext.getResponse(); 
	        response.setContentType("application/json;charset=utf-8");
			pw=ServletActionContext.getResponse().getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.print(stu1);
		pw.close();
		System.out.println(stu1);
		return "success";
	}
	//修改登入者的账户信息(例如用户名和密码)
	public String updateUser() {
		//System.out.println("进入action层中的修改帐号方法"+user);
		ts.updateUser(user);
		return "success";
	}
}
