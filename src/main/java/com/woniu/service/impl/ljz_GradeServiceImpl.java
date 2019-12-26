package com.woniu.service.impl;

<<<<<<< HEAD
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
=======
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.ljz_IGradeDAO;
import com.woniu.dao.ljz_IStuDAO;
import com.woniu.pojo.Grade;
import com.woniu.pojo.Student;
import com.woniu.service.ljz_IGradeService;

@Service
@Transactional
public class ljz_GradeServiceImpl implements ljz_IGradeService {
	@Autowired
	ljz_IGradeDAO ig;
	
	@Autowired
	ljz_IStuDAO is;
	
	
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

	@Override
	public void stuExcel(String filePath){
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		String str = "";
			//需要解析的Excel文件
			File file=new  File(filePath);
			try {
				//获取工作簿
				FileInputStream fs=FileUtils.openInputStream(file);
				HSSFWorkbook workbook = new HSSFWorkbook(fs);
				
			    //获取第一个工作表
				HSSFSheet hs=workbook.getSheetAt(0);
				
				//获取Sheet的第一个行号和最后一个行号
				int last=hs.getLastRowNum();
				int first=hs.getFirstRowNum();
				
				//遍历获取单元格里的信息
				for (int i = first+1; i <last; i++) {
					HSSFRow row=hs.getRow(i);
					int firstCellNum=row.getFirstCellNum();//获取所在行的第一个行号
					int lastCellNum=row.getLastCellNum();//获取所在行的最后一个行号
					
					for (int j = firstCellNum; j <lastCellNum; j++) {
						HSSFCell cell=row.getCell(j);
						
						String value = cell.getStringCellValue();
						
						str+=(value+" ");
					}
					str+="\n";
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] split = str.split("\n");
			for (String s : split) {
				Student stu = new Student();
				try {
				stu.setStuName(s.split(" ")[0]);
				stu.setStuSex(s.split(" ")[1]);
				stu.setStuCard(s.split(" ")[2]);
				stu.setInTime(new SimpleDateFormat("yyyy/MM/dd").parse(s.split(" ")[3]));
				stu.setOutTime(new SimpleDateFormat("yyyy/MM/dd").parse(s.split(" ")[4]));
				stu.setStuPhone(s.split(" ")[5]);
				stu.setStuAdd(s.split(" ")[6]);
				stu.setStuEdu(s.split(" ")[7]);
				stu.setStuCollege(s.split(" ")[8]);
				stu.setStuMajor(s.split(" ")[9]);
				stu.setStuGradu(new SimpleDateFormat("yyyy/MM/dd").parse(s.split(" ")[10]));
				
				list.add(stu);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			for (Student st : list) {
				is.save(st);
			}
			
>>>>>>> branch 'master' of https://github.com/ljz890530/Student.git
	}

}
