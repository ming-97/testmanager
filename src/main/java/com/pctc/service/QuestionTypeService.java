package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionType;
import com.pctc.model.QuestionTypeExample;

/**
 * 题型service
 * @author zks
 * @date 2019-10-19
 * @version 0.1
 *
 */
public interface QuestionTypeService {
	
	//1.根据id查询题型信息
	public QuestionType getQuestionTypeById(Long qtId);
	
	
	//2.根据题型名称返回题型信息
	public QuestionType getQuestionTypeName(String qtName);
	
	
	
	//查询所有题型
	public List<QuestionType> selectAllQuestionType(QuestionTypeExample example);
	
	


}
