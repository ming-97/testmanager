package com.pctc.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.TeacherMapper;
import com.pctc.model.Teacher;
import com.pctc.model.TeacherExample;
import com.pctc.service.TeacherService;


@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;

	
    //教师查询	（登录）
	@Transactional(readOnly=true)
	public List<Teacher> seleteByExample(TeacherExample example) {
		List<Teacher> teachers=teacherMapper.selectByExample(example);
		
				return teachers;
	}
	
	//根据教师id查询教师信息
	@Transactional(readOnly=true)
	public Teacher selectTeacher(long tId) {
	Teacher teacher=teacherMapper.selectByPrimaryKey(tId);
	return teacher;
	}
   
	
	//教师添加(注册)
	public int inseltTeacher(Teacher teacher) {
		int count=teacherMapper.insertSelective(teacher);
		return count;
	}

   //更新教师信息
	public int updateTeacher(Teacher teacher) {
		int count=teacherMapper.updateByPrimaryKeySelective(teacher);
		return count;
	}
   
	//真删除教师信息
	public int deleteTeacher(long tId) {
		int count=teacherMapper.deleteByPrimaryKey(tId);
		return count;
	}

	//假删除教师信息
	public int deleteTeacherFalse(long tId) {
	   int count=0;
	   Teacher teacher=null;
	   teacher=teacherMapper.selectByPrimaryKey(tId);
	   if (teacher !=null){
		   teacher.settDelete(true);
		   count=teacherMapper.updateByPrimaryKey(teacher);   
	   }
	   return count;	   
	}

}
