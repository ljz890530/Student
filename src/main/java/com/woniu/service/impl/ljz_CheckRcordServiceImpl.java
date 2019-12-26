package com.woniu.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ljz_ICheckRecordDAO;
import com.woniu.pojo.Chrecord;
import com.woniu.service.ljz_ICheckRecordService;
@Service
@Transactional
public class ljz_CheckRcordServiceImpl implements ljz_ICheckRecordService {

	@Autowired
	ljz_ICheckRecordDAO icr;
	
	@Override
	public void save(Chrecord chrecord) {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-DD");
		String dateTmp = sm.format(new Date());
		try {
			Date date = sm.parse(dateTmp);
			chrecord.setChReTime(date);
			icr.save(chrecord);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Chrecord> findAll(Integer stuId) {
		return icr.findAll(stuId);
	}

	

}
