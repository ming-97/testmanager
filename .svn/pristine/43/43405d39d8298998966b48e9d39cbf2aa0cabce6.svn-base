package com.pctc.service;

import java.util.List;

import com.pctc.model.Student;
import com.pctc.model.StudentExample;

public interface TeacherStudentService {

	// 条件查询所有学生,StudentExample条件类
	public List<Student> getStudent(StudentExample example);

	// 添加学生
	public int addStudent(Student student);

	// 根据id查询学生
	public Student getStudent(Long sId);

	// 修改学生
	public int updateStudent(Student student);

	// 真删除学生
	public int deleteStudentTrue(Long sId);
	
	
	
	
	// 假删除学生
	public int deleteStudentFalse(Long sId);
}
