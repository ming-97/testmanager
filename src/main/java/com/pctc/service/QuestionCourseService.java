package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionCourse;
import com.pctc.model.QuestionCourseExample;

/**
 * �γ���ϰservice
 * @author zw
 *@date 2019-10-16
 *@version 0.1
 */
public interface QuestionCourseService {

	//��ӿγ���ϰ��Ŀ
	public	int insertQuestionCourse(QuestionCourse qCourse);
	
	
	//��ѯ�γ���ϰ��Ŀ
	public List<QuestionCourse> selectAllQuestionCourse(QuestionCourseExample example);
	
	
	//����id���ҿγ���ϰ��Ϣ
	public QuestionCourse selectQuestionCourseById(QuestionCourse qCourse);
	
	
	
	//����id�޸Ŀγ���ϰ��Ŀ
	public int updateQuestionCourse(QuestionCourse qCourse);
	
	
}
