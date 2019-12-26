package com.hwm.test;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woniu.dao.ITeacherDAO;
import com.woniu.dao.IUserDAO;
import com.woniu.pojo.Grade;
import com.woniu.service.ITeacherService;
import com.woniu.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AppTest {
	@Autowired
	ITeacherDAO td;
	@Autowired
	ITeacherService ts;
	@Autowired
	IUserDAO ud;
	@Autowired
	IUserService us;
	@Autowired
	SessionFactory sf;
	@Test
	public void test() {
		System.out.println(ts.findAllGrade());
		
		//System.out.println(sf.openSession().createSQLQuery("select * from grade").addEntity(Grade.class).list());
	}

}
