package com.pctc.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pctc.model.Student;
import com.pctc.model.StudentExample;
import com.pctc.model.StudentExample.Criteria;
import com.pctc.service.TeacherStudentService;

public class TestTeacherStudent {

	private static ApplicationContext context = null;
	private TeacherStudentService studentService = null;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		studentService = (TeacherStudentService) context.getBean("teacherStudentService");
	}
	
	@Test
	public void TestAddStudent() {
		Student student = new Student(new Long(1001), "小明", "123456",new Date(), false);
		int count = studentService.addStudent(student);
		System.out.println(count);
	}
	
	@Test
	public void TestGetStudents() {
		List<Student> students = null;
		StudentExample example = null;
		students = studentService.getStudent(example);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void TestGetStudent() {
		Student student=studentService.getStudent(new Long(1));
		if (student!=null) {
			System.out.println(student);
		}
	}
	
	@Test
	public void TestGetStudent1() {
		List<Student> students = null;
		StudentExample example = new StudentExample();
		Criteria criteria=example.createCriteria();
		criteria.andSUsernameLike("%"+"明"+"%");
		students = studentService.getStudent(example);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void TestUpdateStudent(){
		Student student=studentService.getStudent(new Long(1));
		if (student!=null) {
			student.setsUsername("小红");
			student.setsInsid(new Long(2));
			int count=studentService.updateStudent(student);
			System.out.println(count);
		}
	}
	
	@Test
	public void TestDeleteStudentTrue(){
		Student student=studentService.getStudent(new Long(1));
		if (student!=null) {
			int count=studentService.deleteStudentTrue(new Long(1));
			System.out.println(count);
		}
	}

	@Test
	public void TestDeleteStudentFalse(){	
		int count=studentService.deleteStudentFalse(new Long(1));
		System.out.println(count);
		
	}
}
