package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionCourseChapter;
import com.pctc.model.QuestionCourseChapterExample;

/**
 * 章节练习service
 * @author zw
 *@date 2019-10-16
 *@version 0.1
 */
public interface QuestionCourseChapterService {

	
	//添加章节练习题目
	public int insertQuestionChapter(QuestionCourseChapter chapter);
	
	
	
	//查询所有章节练习题目
	public List<QuestionCourseChapter> selectAllQuestionCourseChapter(QuestionCourseChapterExample example);
	
	
	//根据id查询章节练习题目
	public QuestionCourseChapter selectQuestionCourseChapter(Long qccId);
	
	
	//更新章节练习题目
	public int updateCourseChapter(QuestionCourseChapter questionCourseChapter);
	
}
