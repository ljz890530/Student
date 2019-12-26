package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Grade;

public interface ljz_IGradeService {
	void update(Grade grade);
	Grade findOne(Integer gId);
	List<Grade> findAll();
<<<<<<< HEAD
=======
	void stuExcel(String filePath);
>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
}
