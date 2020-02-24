package com.pctc.test;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;
import com.pctc.service.QuestionErrorService;

/**
 * 错题表测试
 * @author zks
 * @date 2019-10-17
 * @version 0.1
 *
 */
public class TestQuestionError {
	
	private static ApplicationContext context = null;
    private	QuestionErrorService questionErrorService;
   
	
	 @Before
	 public void init() throws Exception {
	   	context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   	questionErrorService= (QuestionErrorService) context.getBean("questionErrorService");
	   }
	 
	 //1.查询所有测试
	 @Test
	 public void testGetAllQuestionError(){
		 QuestionErrorExample questionErrorExample=null;
		 List<QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
		 for(QuestionError questionError:questionErrorList){
			 System.out.println(questionError);
		 }
		 
	 }
	 
	 
	 //2.添加错题的测试
	 @Test
	 public void testAddQuestionError(){
		 QuestionError questionError=new QuestionError();
		 long qeQpid=Long.parseLong("2");
		 long qeInsid=Long.parseLong("2");
		 long qeSid=Long.parseLong("2");
		 questionError.setQeSid(qeSid);
		 questionError.setQeQpid(qeQpid);
		 questionError.setQeInsid(qeInsid);
		 questionError.setQeDelete(false);
		 int recordNumber=questionErrorService.addQuestionError(questionError);
		 System.out.println(recordNumber);
	 }
	 
	 
	 //3.删除错题的测试
	 @Test
	 public void testDeleteQuestionError(){
		 long qeId=Long.parseLong("1");
		 int recordNumber=questionErrorService.deleteQuestionError(qeId);
		 System.out.println(recordNumber);
		 
	 }
	 
	 
	 //4.修改试题的测试
	 @Test
	 public void testUpdateQuestionError(){
		 QuestionError questionError=new QuestionError();
		 long qeId=Long.parseLong("2");
		 long qeQpid=Long.parseLong("2");
		 long qeInsid=Long.parseLong("2");
		 long qeSid=Long.parseLong("3");
		 questionError.setQeSid(qeSid);
		 questionError.setQeId(qeId);
		 questionError.setQeQpid(qeQpid);
		 questionError.setQeInsid(qeInsid);
		 questionError.setQeDelete(false);
		 int recordNumber=questionErrorService.updateQuestionError(questionError);
		 System.err.println(recordNumber);
	 
	 }
	 
	 
	//5.根据id查询错题测试
	 @Test
	 public void testGetQuestionErrorById(){
		 long qeId=Long.parseLong("2");
		QuestionError questionError=questionErrorService.getQuestionErrorById(qeId);
		System.out.println(questionError);
	 }
	 
	 
	 
	 
	 

}
