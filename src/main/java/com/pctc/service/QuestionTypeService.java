package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionType;
import com.pctc.model.QuestionTypeExample;

/**
 * ����service
 * @author zks
 * @date 2019-10-19
 * @version 0.1
 *
 */
public interface QuestionTypeService {
	
	//1.����id��ѯ������Ϣ
	public QuestionType getQuestionTypeById(Long qtId);
	
	
	//2.�����������Ʒ���������Ϣ
	public QuestionType getQuestionTypeName(String qtName);
	
	
	
	//��ѯ��������
	public List<QuestionType> selectAllQuestionType(QuestionTypeExample example);
	
	


}