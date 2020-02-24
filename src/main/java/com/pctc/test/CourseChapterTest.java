package com.pctc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.dao.CourseChapterMapper;
import com.pctc.model.CourseChapter;
import com.pctc.model.CourseChapterExample;
import com.pctc.service.CourseChapterService;


public class CourseChapterTest {

	
	
	private static ApplicationContext context = null;
	private CourseChapterService courseChapterService = null;
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		courseChapterService= (CourseChapterService) context.getBean("courseChapterService");
	}
	
	
	
	@Test
	public void TestSeleteCourseChapter(){
		CourseChapterExample courseChapterExample=new CourseChapterExample();
		List<CourseChapter> courseChapters=courseChapterService.selectAllCourseChapter(courseChapterExample);
		for(CourseChapter courseChapter:courseChapters)
			System.out.println(courseChapter.getCcId()+" "+courseChapter.getCcCid()+" "+courseChapter.getCcInsid()+" "
		  + courseChapter.getCcName()+" "+courseChapter.getCcDelete()
					);
		
	}
	@Test
	public void TestAddCourseChapter(){
		CourseChapter courseChapter =new CourseChapter();
		courseChapter.setCcCid(Long.parseLong("1"));
		courseChapter.setCcInsid(Long.parseLong("1"));
		courseChapter.setCcName("skks");
		courseChapter.setCcDelete(false);
		int count=courseChapterService.addCourseChapter(courseChapter);
		System.out.println(count);
	}
	
	@Test
	public void TestUpdataCourseChapter(){
		CourseChapter courseChapter =new CourseChapter();
		courseChapter.setCcId(Long.parseLong("2"));
		courseChapter.setCcCid(Long.parseLong("2"));
		courseChapter.setCcInsid(Long.parseLong("2"));
		courseChapter.setCcName("skss");
		courseChapter.setCcDelete(false);
		int count=courseChapterService.updataCourseChapter(courseChapter);
		System.out.println(count);
	}
	
	@Test
	public void TestDeleteCourseChapter(){
		long ccId=Long.parseLong("2");
		int count=courseChapterService.deleteCourseChapter(Long.parseLong("2"));
		System.out.println(count);
				
		
		
	}
	
	
}
