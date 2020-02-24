package com.pctc.test;

import java.util.ArrayList;
import java.util.HashMap;

/*import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionDaily;
import com.pctc.service.QuestionService;

public class TestQuestionDaily {
	
	
	private ApplicationContext context=null;
	private QuestionService qService=null;
	
	
	@Before
	public void init(){
		System.out.println("sss");
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		qService=(QuestionService)context.getBean("questionService");
		
	}
	
	@Test
	public void addQuestion(){
		int count =0;
		QuestionDaily qDaily=new QuestionDaily();
		qDaily.setQdId(new Long(1));
		qDaily.setQdDelete(false);
		qDaily.setQdInsid(new Long("1001"));
		qDaily.setQdQbid("1,2,3,4,5,6,7,8,9,10");
		count=qService.insertQuestionDaily(qDaily);
		System.out.println(count);
	}

}*/



import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import com.pctc.model.QuestionPaper;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionDailyService;

/**
 * 每日一练测试
 * @author zks
 * @date 2019-10-16
 * @version 0.1
 *
 */


public class TestQuestionDaily {
	
	private static ApplicationContext context = null;
    private QuestionDailyService questionDailyService;
    private QuestionBankService questionBnakService;
    
    @Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		questionDailyService = (QuestionDailyService) context.getBean("questionDailyService");
		questionBnakService=(QuestionBankService)context.getBean("questionService");
    }
    
    
    
  //1.根据id查询每日一练信息测试
    @Test
    public void testGetQuestionDailyById(){
    	HttpServletRequest request = null;
    	QuestionDaily questionDaily=new QuestionDaily();
    	QuestionBnak questionBnak=new QuestionBnak();
    	List<QuestionBnak> questionBnakList=new ArrayList<QuestionBnak>();
    	Map<String, Object> map=new HashMap<String, Object>();
    	long qdId=Long.parseLong("1");
    	questionDaily=questionDailyService.getQuestionDailyById(qdId);
    	System.out.println(questionDaily.getQdQbid());
    	String qbIds[]=questionDaily.getQdQbid().split(",");
    	
    	System.out.println("------------");
    	
    	for(int i=0;i<qbIds.length;i++){
    		long qbId1=Long.parseLong(qbIds[i]);
    		questionBnak=questionBnakService.getQusetionBankById(qbId1);
    		questionBnakList.add(questionBnak);
    		map.put(qbIds[i], questionBnak);
    	}
    	
    	
    	for(QuestionBnak questionBnak1:questionBnakList){
    		System.out.println(questionBnak1);
    	}
    	
    	
    	System.out.println("------------");
    	for(int i=0;i<qbIds.length;i++){
    		System.out.println(map.get(qbIds[i]));
    	}
    	
    	System.out.println("------------");
    	request.setAttribute("questionDaily", questionDaily);
    	System.out.println(questionDaily);
    	QuestionDaily questionDaily1= (QuestionDaily) request.getAttribute("questionDaily");
    	System.out.println(questionDaily1.getQdQbid());
    	
    	
    	
		
    }
    
    
    //2.根据id查询所有测试
    @Test
    public void testGetAllQuestionDaily(){
    	QuestionDailyExample questionDailyExample=null;
    	List<QuestionDaily> questionDailyList=questionDailyService.getAllQuestionDaily(questionDailyExample);
    	for(QuestionDaily questionDaily:questionDailyList){
    		System.out.println(questionDaily);
    	}
    	/*QuestionDaily questionDaily=new QuestionDaily();
    	System.err.println(questionDaily);
    	
    	QuestionPaper questionPapers[]=new QuestionPaper[2];
    	for(int i=0;i<2;i++){
    		System.out.println(questionPapers[i]);
    		*/
    	}
		
    }
    
    
	//@Test
	/*public void addQuestion(){
		int count =0;
		QuestionDaily qDaily=new QuestionDaily();
		qDaily.setQdId(new Long(1));
		qDaily.setQdDelete(false);
		qDaily.setQdInsid(new Long("1001"));
		qDaily.setQdQbid("1,2,3,4,5,6,7,8,9,10");
		count=qService.insertQuestionDaily(qDaily);
		System.out.println(count);
	}*/
    



