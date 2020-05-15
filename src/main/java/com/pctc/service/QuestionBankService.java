package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionBnakExample;

public interface QuestionBankService {
	/**
	 * �������
	 * @param qBnak
	 * @return
	 */
	public int insertQuestion(QuestionBnak qBnak);
	
	
	/**
	 * ��ѯ���������Ŀ
	 * @param qBnakExample
	 * @return
	 */
	List<QuestionBnak> selectAllQuestion(QuestionBnakExample qBnakExample);
	

	//1.�������id����������Ϣ
	public QuestionBnak getQusetionBankById(Long qbId);
	
	//����id���������Ŀ
	public int updateQuestionBnak(QuestionBnak qBnak);

	
	//����idɾ�������Ŀ
	public int deleteQuestionBnak(QuestionBnak qBnak);
	
	
	//����idɾ��---��ɾ��
	//public int deleteQuestionBnak(QuestionBnakExample example);
	
	
}