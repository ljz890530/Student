package com.woniu.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ljz_IStuDAO;
import com.woniu.pojo.Student;
import com.woniu.service.ljz_IStuService;
@Service
@Transactional
public class ljz_StuServiceImpl implements ljz_IStuService{
	
	@Autowired
	ljz_IStuDAO stuDAO;
	
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
		stuDAO.update(stu);
	}

	@Override
	public Student findOne(Integer id) {
		return stuDAO.findOne(id);
	}

	@Override
	public List<Student> findAll() {
		return stuDAO.findAll();
	}

	@Override
	public void merge(Student stu) {
		stuDAO.marge(stu);
		
	}

}
