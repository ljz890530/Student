package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ljz_ICheckDAO;
import com.woniu.pojo.Check;
import com.woniu.service.ljz_ICheckService;
@Service
@Transactional
public class ljz_CheckServiceImpl implements ljz_ICheckService {
	@Autowired
	ljz_ICheckDAO ik;
	@Override
	public Check findOne(Integer chId) {
		Check check =  ik.findOne(chId);
		return check;
	}
	@Override
	public List<Check> findAll() {
		return ik.findAll();
	}

}
