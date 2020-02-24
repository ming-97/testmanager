package com.pctc.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;

import net.sf.jsqlparser.statement.insert.Insert;

/**
 * ÿ��һ��service
 * @author Administrator
 *@date 2019-10-16
 *@version 0.1
 */
public interface QuestionDailyService {
	
	//1.����id��ѯÿ��һ����Ϣ
	public QuestionDaily getQuestionDailyById(Long qdId);
	
	/**
	 * ��ѯ����ÿ��һ����Ŀ
	 * @param dailyExample
	 * @return
	 */
	public List<QuestionDaily> getAllQuestionDaily(QuestionDailyExample example);
	
	
	//���ÿ��һ����Ŀ
	public int insertQuestionDaily(QuestionDaily qDaily);
	
	
	
	//����id�޸�ÿ��һ����Ŀ
	public int updateQuestionDaily(QuestionDaily qDaily);

}
