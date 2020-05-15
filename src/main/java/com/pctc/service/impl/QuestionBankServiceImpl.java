package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.QuestionBnakMapper;
import com.pctc.dao.QuestionTypeMapper;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionBnakExample;
import com.pctc.model.QuestionBnakExample.Criteria;
import com.pctc.model.QuestionType;
import com.pctc.model.QuestionTypeExample;
import com.pctc.service.QuestionBankService;
/**
 * ������������ɾ��
 * @author zw
 *
 */
@Service("questionService")
@Transactional
public class QuestionBankServiceImpl implements QuestionBankService {
	

	@Autowired
	private QuestionBnakMapper qBnakMapper;
	
	

	//���������Ŀ
	public int insertQuestion(QuestionBnak qBnak) {
		int count=0;
		if(qBnak!=null)
			count=qBnakMapper.insertSelective(qBnak);
		return count;
	}

	//��ѯ���������Ŀ
	@Transactional(readOnly=true)
	public List<QuestionBnak> selectAllQuestion(QuestionBnakExample qBnakExample) {
		List<QuestionBnak> list=qBnakMapper.selectByExample(qBnakExample);
		return list;
	}

	//������Ŀ��id�������Ŀ�����޸�
	public int updateQuestionBnak(QuestionBnak qBnak) {
		int count=0;
		if(qBnak!=null){
			count=qBnakMapper.updateByPrimaryKeySelective(qBnak);
		}
		return count;
	}
 
	
	//������Ŀidȥ����ѯ��Ŀ��Ϣ
	public QuestionBnak selectByQuestionId(QuestionBnak qBnak) {
		QuestionBnak quBnak=qBnakMapper.selectByPrimaryKey(qBnak.getQbId());
		return quBnak;
	}


	
	//1.�������id����������Ϣ��ʵ��
	@Transactional(readOnly=true)
	public QuestionBnak getQusetionBankById(Long qbId) {
		QuestionBnak questionBnak=qBnakMapper.selectByPrimaryKey(qbId);
		return questionBnak;
	}


	//������Ŀidɾ����Ŀ��
	public int deleteQuestionBnak(QuestionBnak qBnak) {
		qBnak.setQbDelete(true);
		int count=qBnakMapper.updateByPrimaryKeySelective(qBnak);
		return count;
	}
}