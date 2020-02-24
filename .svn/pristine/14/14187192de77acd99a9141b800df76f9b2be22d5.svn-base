package com.pctc.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;

import net.sf.jsqlparser.statement.insert.Insert;

/**
 * 每日一练service
 * @author Administrator
 *@date 2019-10-16
 *@version 0.1
 */
public interface QuestionDailyService {
	
	//1.根据id查询每日一练信息
	public QuestionDaily getQuestionDailyById(Long qdId);
	
	/**
	 * 查询所有每日一练题目
	 * @param dailyExample
	 * @return
	 */
	public List<QuestionDaily> getAllQuestionDaily(QuestionDailyExample example);
	
	
	//添加每日一练题目
	public int insertQuestionDaily(QuestionDaily qDaily);
	
	
	
	//根据id修改每日一练题目
	public int updateQuestionDaily(QuestionDaily qDaily);

}
