package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;

/**
 * 错题表service
 * @author zks
 * @date 2019-10-17
 * @version 0.1
 *
 */
public interface QuestionErrorService {
	
	
	//1.查询所有
	public List<QuestionError> getAllQuesionError(QuestionErrorExample questionErrorExample);
	
	//2.增加错题
	public int addQuestionError(QuestionError questionError);
	
	//3.删除错题
	public int deleteQuestionError(Long qeId);
	
	//4.修改错题
	public int updateQuestionError(QuestionError questionError);
	
	//5.根据id查询错题
	public QuestionError getQuestionErrorById(Long qeId);

}
