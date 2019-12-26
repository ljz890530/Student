package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Grade;

public interface ljz_IGradeDAO {
	void update(Grade grade);
	Grade findOne(Integer gId);
	List<Grade> findAll();
}
