package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Check;
import com.woniu.pojo.Student;

public interface ljz_ICheckService {
	Check findOne(Integer chId);
	List<Check> findAll();
}
