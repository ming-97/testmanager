package com.pctc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.Grade;
import com.pctc.model.GradeExample;
import com.pctc.service.GradeService;

/**
 * 分数测试类
 * @author zks
 * @date 2010-10-24
 * @version 0.1
 *
 */
public class TestGrade {
	private static ApplicationContext context = null;
    private	GradeService gradeService;
   
    
    
    @Before
   	public void init() throws Exception {
   		context = new ClassPathXmlApplicationContext("applicationContext.xml");
   		gradeService= (GradeService) context.getBean("gradeService");
       }
    
    
    //1.添加答题信息测试
    @Test 
    public void addGrade(){
    	Grade grade=new Grade();
    	grade.setgSid(Long.parseLong("2"));
    	grade.setgQpname("每日一练1");
    	grade.setgInsid(Long.parseLong("2"));
    	grade.setgGrade(20);
    	grade.setgDelete(false);
    	int recordNumber=gradeService.addGrade(grade);
    	System.out.println(recordNumber);
    	
    
    	
    }
    
    //2.查询分数信息测试
    @Test
    public void getGrade(){
    	GradeExample gradeExample=null;
    	List<Grade> gradeList=gradeService.getGrade(gradeExample);
    	for(Grade grade:gradeList){
    		System.out.println(grade);
    	}
    	
    }

}
