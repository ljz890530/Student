package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ljz_IGradeDAO;
import com.woniu.pojo.Grade;
import com.woniu.service.ljz_IGradeService;

@Service
@Transactional
public class ljz_GradeServiceImpl implements ljz_IGradeService {
	@Autowired
	ljz_IGradeDAO ig;
	
	@Override
	public void update(Grade grade) {
		ig.update(grade);
	}

	@Override
	public Grade findOne(Integer gId) {
		return ig.findOne(gId);
	}

	@Override
	public List<Grade> findAll() {
		return ig.findAll();
	}

}
