package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.QuestionDailyMapper;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import com.pctc.service.QuestionDailyService;

@Service("questionDailyService")
@Transactional
public class QuestionDailyServiceImpl implements QuestionDailyService{
	
	
	@Autowired
	private QuestionDailyMapper quesionDailyMapper;

	
	//1.����id��ѯÿ��һ����Ϣ��ʵ��
	@Transactional(readOnly=true)  //����ע�⣺����Ҫ�����ݿ����ݽ��в�����ֻ�ǽ��ж�����
	public QuestionDaily getQuestionDailyById(Long qdId) {
		QuestionDaily questionDaily=new QuestionDaily();
		questionDaily=quesionDailyMapper.selectByPrimaryKey(qdId);
		return questionDaily;
	}

	//���ÿ��һ����Ŀ
	public int insertQuestionDaily(QuestionDaily qDaily) {
		int count =0;
		if(qDaily!=null)
		 count=quesionDailyMapper.insertSelective(qDaily);
		return count;
	}


	//2.��ѯ����
	@Transactional(readOnly=true)  //����ע�⣺����Ҫ�����ݿ����ݽ��в�����ֻ�ǽ��ж�����
	public List<QuestionDaily> getAllQuestionDaily(QuestionDailyExample questionDailyExample) {
		List<QuestionDaily> questionDailyList=quesionDailyMapper.selectByExample(questionDailyExample);
		return questionDailyList;
	}

	
	
	
	//����id�޸�ÿ��һ����Ŀ
	public int updateQuestionDaily(QuestionDaily qDaily) {
		int count=0;
		count=quesionDailyMapper.updateByPrimaryKeySelective(qDaily);
		return count;
	}



	
	

}
