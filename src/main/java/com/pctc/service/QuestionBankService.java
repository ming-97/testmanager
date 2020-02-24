package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionBnakExample;

public interface QuestionBankService {
	/**
	 * 添加题库
	 * @param qBnak
	 * @return
	 */
	public int insertQuestion(QuestionBnak qBnak);
	
	
	/**
	 * 查询所有题库题目
	 * @param qBnakExample
	 * @return
	 */
	List<QuestionBnak> selectAllQuestion(QuestionBnakExample qBnakExample);
	

	//1.根据题库id查找试题信息
	public QuestionBnak getQusetionBankById(Long qbId);
	
	//根据id更新题库题目
	public int updateQuestionBnak(QuestionBnak qBnak);

	
	//根据id删除提库题目
	public int deleteQuestionBnak(QuestionBnak qBnak);
	
	
	//根据id删除---假删除
	//public int deleteQuestionBnak(QuestionBnakExample example);
	
	
}
