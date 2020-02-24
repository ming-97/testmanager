package com.pctc.test;


import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.Teacher;
import com.pctc.model.TeacherExample;
import com.pctc.service.TeacherService;

public class TestTeacher {
 
	
	private static ApplicationContext context = null;
	private TeacherService teacherService=null;
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		teacherService = (TeacherService) context.getBean("teacherService");
	}
	
	
	//查询
	@Test
	public void TestSeleteTeacher(){
		TeacherExample teacherExample=null;
		List<Teacher> teachers=teacherService.seleteByExample(teacherExample);
		for(Teacher teacher :teachers)
			System.out.println(teacher.gettId()+" "+teacher.gettInsid()+" "+teacher.gettUsername()+" "
					+teacher.gettPassword()+" "+teacher.gettDelete());
	}
	
	
	//根据教师ID查询教师信息
	@Test
	public void TestSeleteTeacherId(){
		Teacher teacher=teacherService.selectTeacher(1);
		if(teacher != null)
		{
			System.out.println(teacher.gettId()+" "+teacher.gettInsid()+" "+teacher.gettUsername()+" "
					+teacher.gettPassword()+" "+teacher.gettDelete());
		}
		}
	
	
	
	//添加
	@Test
	public void TestInsertTeacher(){
		Teacher teacher =new Teacher();
		teacher.settInsid(Long.parseLong("1"));
		teacher.settUsername("zhangsan1111");
		teacher.settPassword("123456");
		teacher.settDelete(false);
		
		int count=teacherService.inseltTeacher(teacher);
		System.out.println(count);
		
	}
	
	
	//更新教师信息
	@Test
	public void TestUpdateTeacher(){
		Teacher teacher=teacherService.selectTeacher(2);
		if(teacher !=null){
			teacher.settInsid(Long.parseLong("1002"));
			teacher.settUsername("zhangsan");
			teacher.settPassword("123456");
			teacher.settDelete(false);
			int count=teacherService.updateTeacher(teacher);
			System.out.println(count);
		}
	}
	
	//真删除教师信息
	@Test
	public void TestDeleteTeacher(){
		Teacher teacher=teacherService.selectTeacher(2);
		if(teacher !=null){
		int count=	teacherService.deleteTeacher(2);
			System.out.println(count);
		}
		
	}
	
	//假删除教师信息
	@Test
	public void TestDeleteFalseTeacher(){
		int count =teacherService.deleteTeacherFalse(16);
		System.out.println(count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
