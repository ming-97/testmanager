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

	
	//1.根据id查询每日一练信息的实现
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public QuestionDaily getQuestionDailyById(Long qdId) {
		QuestionDaily questionDaily=new QuestionDaily();
		questionDaily=quesionDailyMapper.selectByPrimaryKey(qdId);
		return questionDaily;
	}

	//添加每日一练题目
	public int insertQuestionDaily(QuestionDaily qDaily) {
		int count =0;
		if(qDaily!=null)
		 count=quesionDailyMapper.insertSelective(qDaily);
		return count;
	}


	//2.查询所有
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public List<QuestionDaily> getAllQuestionDaily(QuestionDailyExample questionDailyExample) {
		List<QuestionDaily> questionDailyList=quesionDailyMapper.selectByExample(questionDailyExample);
		return questionDailyList;
	}

	
	
	
	//根据id修改每日一练题目
	public int updateQuestionDaily(QuestionDaily qDaily) {
		int count=0;
		count=quesionDailyMapper.updateByPrimaryKeySelective(qDaily);
		return count;
	}



	
	

}
