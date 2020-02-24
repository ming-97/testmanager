package com.pctc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionBnak;
import com.pctc.service.QuestionBankService;

/**
 * 每日一练测试
 * @author zks
 * @date 2019-10-18
 * @version 0.1
 *
 */
public class TestQuestionBank {
	
	private static ApplicationContext context = null;
	private QuestionBankService questionService;
	
	
	   @Before
		public void init() throws Exception {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			questionService = (QuestionBankService) context.getBean("questionService");
			
	    }
	   
	   
	   //1.根据题库id查找试题信息的测试
	   @Test
	   public void testGetQusetionBankById(){
		   long qbId=Long.parseLong("1");
		   QuestionBnak questionBnak=questionService.getQusetionBankById(qbId);
		   System.out.println(questionBnak);
	   }
	

}
