package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Grade;

public interface ljz_IGradeService {
	void update(Grade grade);
	Grade findOne(Integer gId);
	List<Grade> findAll();
}
