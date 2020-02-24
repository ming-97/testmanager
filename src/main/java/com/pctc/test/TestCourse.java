package com.pctc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.dao.CourseMapper;
import com.pctc.model.Course;
import com.pctc.model.CourseExample;
import com.pctc.model.CourseExample.Criteria;
import com.pctc.model.Teacher;
import com.pctc.service.CourseService;


public class TestCourse {

	
	
	private static ApplicationContext context = null;
	private CourseService courseService=null;
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		courseService= (CourseService) context.getBean("courseService");
	}
	
	@Test
	public void TestSeleteCourse(){
            CourseExample courseExample=null;
            List<Course> courses=courseService.seleteAllCourse(courseExample);
    		for(Course course :courses)
    			System.out.println(course.getcId()+" "+course.getcInsid()+" "+course.getcName()+" "
    					+course.getcDelete());
	}
	
	
	@Test
	public void TestAddCourse(){
		Course course=new Course();
		course.setcInsid(Long.parseLong("1"));
		course.setcName("lsii");
		course.setcDelete(false);
		
		int count=courseService.AddCourse(course);
		System.out.println(count);
		
	}
	
	@Test
	public void TestUpdateCourse(){
		Course course=new Course();
		course.setcId(Long.parseLong("2"));
		course.setcInsid(Long.parseLong("3"));
		course.setcName("lsii");
		course.setcDelete(false);
		int count=courseService.updateCourse(course);
		System.out.println(count);
		
	}
	
	@Test
	public void TestDeleteCourse(){
		long cId=Long.parseLong("2");
		int count=courseService.deleteCourse(Long.parseLong("2"));
	System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
}
