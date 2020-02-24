package com.pctc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.Course;
import com.pctc.model.CourseExample;
import com.pctc.service.CourseService;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionCourseService;

public class TestQuestionCourse {

	private static ApplicationContext context = null;
	private QuestionBankService questionService;
	private QuestionCourseService questionCourseService;
	private CourseService courseService;
	
	
	   @Before
		public void init() throws Exception {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			questionService = (QuestionBankService) context.getBean("questionService");
			courseService=(CourseService)context.getBean("courseService");
			
	    }

	   @Test
	   public void selectAllCourse(){
		   CourseExample example=new CourseExample();
		  // questionCourseService.selectAllQuestionCourse(example);
		   List<Course> list=courseService.seleteAllCourse(example);
		   for(Course course:list)
			   System.out.println(course);
	   }
	
}
