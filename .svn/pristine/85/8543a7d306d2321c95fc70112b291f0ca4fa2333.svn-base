package com.pctc.service;

import java.util.List;

import com.pctc.model.Teacher;
import com.pctc.model.TeacherExample;

public interface TeacherService {

	//条件查询（登录）
	public List<Teacher> seleteByExample(TeacherExample example);
	
	//根据教师id查询教师信息
	public Teacher selectTeacher(long tId);
	
	//教师添加
	public int inseltTeacher(Teacher teacher );
	
	//更新教师信息
	public int updateTeacher(Teacher teacher);
	
	//真删除教师信息
	public int deleteTeacher(long tId);
	
	//假删除教师信息
	public int deleteTeacherFalse(long tId);
}
