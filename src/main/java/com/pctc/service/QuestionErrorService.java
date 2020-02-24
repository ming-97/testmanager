package com.pctc.service;

import java.util.List;

import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;

/**
 * �����service
 * @author zks
 * @date 2019-10-17
 * @version 0.1
 *
 */
public interface QuestionErrorService {
	
	
	//1.��ѯ����
	public List<QuestionError> getAllQuesionError(QuestionErrorExample questionErrorExample);
	
	//2.���Ӵ���
	public int addQuestionError(QuestionError questionError);
	
	//3.ɾ������
	public int deleteQuestionError(Long qeId);
	
	//4.�޸Ĵ���
	public int updateQuestionError(QuestionError questionError);
	
	//5.����id��ѯ����
	public QuestionError getQuestionErrorById(Long qeId);

}
