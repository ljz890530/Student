package com.woniu.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IStuDAO;
import com.woniu.pojo.Student;
import com.woniu.service.IStuService;
@Service
public class StuServiceImpl implements IStuService{
	
	@Autowired
	IStuDAO stuDAO;
	
	@Override
	public void save(Student stu) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(new Date());
		try {
			Date date = sdf.parse(format);
			stu.setInTime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stuDAO.save(stu);
	}

	@Override
	public void delete(Student stu) {
		
	}

	@Override
	public void update(Student stu) {
		
	}

	@Override
	public Student findOne(Integer id) {
		return null;
	}

	@Override
	public List<Student> findAll() {
		return null;
	}

}
