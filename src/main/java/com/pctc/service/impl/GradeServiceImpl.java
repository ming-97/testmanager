package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.GradeMapper;
import com.pctc.model.Grade;
import com.pctc.model.GradeExample;
import com.pctc.service.GradeService;
/**
 * 分数service的实现
 * @author zks
 * @date 2010-10-24
 * @version 0.1
 *
 */
@Service("gradeService")
@Transactional
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	private GradeMapper gradeMapper;

	
	//1.添加分数信息的实现
	public int addGrade(Grade grade) {
		int recordNumber=gradeMapper.insertSelective(grade);
		return recordNumber;
	}

    //2.查询分数信息的实现
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public List<Grade> getGrade(GradeExample gradeExample) {
		List<Grade> gradeList=gradeMapper.selectByExample(gradeExample);
		return gradeList;
	}

}
