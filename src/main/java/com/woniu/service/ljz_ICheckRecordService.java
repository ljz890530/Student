package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Chrecord;
import com.woniu.pojo.Student;

public interface ljz_ICheckRecordService {
	void save(Chrecord chrecord);
	List<Chrecord> findAll(Integer stuId);
}
