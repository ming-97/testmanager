package com.pctc.test;
import org.junit.Before;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionDaily;
import com.pctc.service.QuestionBankService;
/**
 * ≤‚ ‘Ã‚ø‚
 * @author Administrator
 *
 */
public class TestQuestionDaily1 {
	
	private  ApplicationContext context=null;
	private  QuestionBankService qService=null;
	
	
	@Before
	public void init() throws Exception{
		System.out.println("sss");
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		qService=(QuestionBankService)context.getBean("questionService");
	}
	
	
}
