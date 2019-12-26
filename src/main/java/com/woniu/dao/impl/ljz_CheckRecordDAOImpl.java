package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ljz_ICheckRecordDAO;
import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Student;
@Repository
public class ljz_CheckRecordDAOImpl implements ljz_ICheckRecordDAO {
	@Autowired
	SessionFactory sessionFcatory;
	
	@Override
	public List<Chrecord> findAll(Integer stuId) {
		Student stu = new Student();
		stu.setStuId(stuId);
		  Criteria c = sessionFcatory.getCurrentSession().createCriteria(Chrecord.class);
		 List<Chrecord> chrecords = c.add(Restrictions.eq("student", stu)).list();
		 System.out.println(chrecords);
		 return chrecords;
	}

	@Override
	public void save(Chrecord checkRecord) {
		sessionFcatory.getCurrentSession().save(checkRecord);
	}	

}
