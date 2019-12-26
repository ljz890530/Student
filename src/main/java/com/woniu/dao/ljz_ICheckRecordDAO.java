package com.woniu.dao;

import java.util.List;

import com.woniu.dao.impl.ljz_CheckRecordDAOImpl;
import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Student;

public interface ljz_ICheckRecordDAO {
	//查找所有考勤记录
	 List<Chrecord> findAll(Integer stuId);
	 void save(Chrecord checkRecord);
	 
}
