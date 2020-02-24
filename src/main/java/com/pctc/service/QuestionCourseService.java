package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionCourse;
import com.pctc.model.QuestionCourseExample;

/**
 * 课程练习service
 * @author zw
 *@date 2019-10-16
 *@version 0.1
 */
public interface QuestionCourseService {

	//添加课程练习题目
	public	int insertQuestionCourse(QuestionCourse qCourse);
	
	
	//查询课程练习题目
	public List<QuestionCourse> selectAllQuestionCourse(QuestionCourseExample example);
	
	
	//根据id查找课程练习信息
	public QuestionCourse selectQuestionCourseById(QuestionCourse qCourse);
	
	
	
	//根据id修改课程练习题目
	public int updateQuestionCourse(QuestionCourse qCourse);
	
	
}
