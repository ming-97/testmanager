package com.pctc.service;

import java.util.List;

import com.pctc.model.Grade;
import com.pctc.model.GradeExample;

/**
 * 分数service
 * @author zks
 * @date 2010-10-24
 * @version 0.1
 *
 */
public interface GradeService {
	//1.添加分数信息
	public int addGrade(Grade grade);
	
	//2.查询分数信息
	public List<Grade> getGrade(GradeExample gradeExample);

}
