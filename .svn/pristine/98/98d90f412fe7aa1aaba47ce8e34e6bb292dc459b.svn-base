package com.pctc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import com.pctc.model.QuestionPaper;
import com.pctc.model.QuestionPaperExample;
import com.pctc.model.QuestionPaperExample.Criteria;
import com.pctc.service.QuestionDailyService;
import com.pctc.service.QuestionPaperService;
import com.pctc.service.QuestionBankService;

/**
 * 答题试题测试类
 * @author zks
 * @date 2019-10-17
 * @version 0.1
 *
 */
public class TestQuestionPaper {
	private static ApplicationContext context = null;
    private	QuestionPaperService questionPaperService;
   
    
    
    @Before
   	public void init() throws Exception {
   		context = new ClassPathXmlApplicationContext("applicationContext.xml");
   		questionPaperService= (QuestionPaperService) context.getBean("questionPaperService");
       }
    
    
    //1.查询所有测试
    @Test
    public void testGetAllQuestionPaper(){
    	QuestionPaperExample questionPaperExample=null;
    	List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
    	/*for(QuestionPaper questionPaper:questionPaperList){
    		System.out.println(questionPaper);
    	}*/
    	for(int i=0;i<questionPaperList.size();i++){
    		System.err.println(questionPaperList.get(i));
    	}
    	/*QuestionPaperExample questionPaperExample=new QuestionPaperExample();
		Criteria criteria=questionPaperExample.createCriteria();
		criteria.andQpNameEqualTo("1");
		
		List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
		for(QuestionPaper questionPaper:questionPaperList){
			System.out.println(questionPaper);
		}*/
    }
    
    
    //2.添加答题信息测试
    @Test 
    public void testAddQusetionPaper(){
    	QuestionPaper questionPaper=new QuestionPaper();
    	long qpSid=Long.parseLong("2");
    	long qpQbid=Long.parseLong("2");
    	long qpInsid=Long.parseLong("3");
    	questionPaper.setQpSid(qpSid);
    	questionPaper.setQpQbid(qpQbid);
    	questionPaper.setQpInsid(qpInsid);
    	questionPaper.setQpAnswer("A");
    	questionPaper.setQpName("第二章练习");
    	questionPaper.setQpDelete(false);
    	int recordNumber=questionPaperService.addQuestionPaper(questionPaper);
    	System.out.println(recordNumber);
    	
    }
    
    
    //3.根据id删除答题信息测试
    @Test
    public void testDeleteQuestionPaper(){
    	long qpId=Long.parseLong("2");
    	int recordNumber=questionPaperService.deleteQuestionPaper(qpId);
    	System.out.println(recordNumber);
    }
    
    
    //4.修改答题信息测试
    @Test
    public void testUpdateQuestionPaper(){
    	QuestionPaper questionPaper=new QuestionPaper();
    	long qpId=Long.parseLong("3");
    	long qpSid=Long.parseLong("2");
    	long qpQbid=Long.parseLong("2");
    	long qpInsid=Long.parseLong("2");
    	questionPaper.setQpId(qpId);
    	questionPaper.setQpSid(qpSid);
    	questionPaper.setQpQbid(qpQbid);
    	questionPaper.setQpInsid(qpInsid);
    	questionPaper.setQpAnswer("A");
    	questionPaper.setQpName("第二章练习");
    	questionPaper.setQpDelete(true);
    	int recordNumber=questionPaperService.updateQuestionPaper(questionPaper);
    	System.out.println(recordNumber);
    }
    
    
    //5.根据id查询答题信息测试
    @Test
    public void testGetQuestionPaperById(){
    	long qpId=Long.parseLong("3");
    	QuestionPaper questionPaper=questionPaperService.getQuestionPaperById(qpId);
    	System.out.println(questionPaper);
    	
    }
    

    
    

}
