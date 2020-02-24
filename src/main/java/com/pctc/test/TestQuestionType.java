package com.pctc.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionType;
import com.pctc.service.QuestionTypeService;
/**
 * 题型测试类
 * @author zks
 * @date 2019-10-19
 * @version 0.1
 *
 */
public class TestQuestionType {

	
	private static ApplicationContext context = null;
    private	QuestionTypeService questionTypeService;
   
    
    
    @Before
   	public void init() throws Exception {
   		context = new ClassPathXmlApplicationContext("applicationContext.xml");
   		questionTypeService= (QuestionTypeService) context.getBean("questionTypeService");
       }
    
    
    //1.查询所有测试
    @Test
    public void testGetQuestionTypeById(){
    	
    	QuestionType questionType=new QuestionType();
    	long qtId=Long.parseLong("1");
    	questionType=questionTypeService.getQuestionTypeById(qtId);
    	System.out.println(questionType);
		
    }
    
    
    //2.根据题型名称返回题型信息测试
    @Test 
    public void testGetQuestionName(){
    	QuestionType questionType=new QuestionType();
    	questionType=questionTypeService.getQuestionTypeName("选择题");
    	System.out.println(questionType);
    }
}
