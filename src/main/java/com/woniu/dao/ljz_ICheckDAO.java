package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Check;

public interface ljz_ICheckDAO {
	Check findOne(Integer chId);//²éÕÒ¿¼ÇÚ×´Ì¬
	List<Check> findAll();
}
