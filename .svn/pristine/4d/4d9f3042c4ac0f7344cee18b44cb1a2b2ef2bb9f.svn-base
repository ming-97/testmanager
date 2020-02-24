package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.CourseMapper;
import com.pctc.model.Course;
import com.pctc.model.CourseExample;
import com.pctc.service.CourseService;


@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseMapper courseMapper;

	//查询课程表
	@Transactional(readOnly=true)
	public List<Course> seleteAllCourse(CourseExample courseExample) {
		List<Course> list=courseMapper.selectByExample(courseExample);
		return list;
	}
     
	
	//添加课程
		public int AddCourse(Course course) {
			int count=courseMapper.insertSelective(course);
			return count;
		}

		//修改课程
		public int updateCourse(Course course) {
			int count=courseMapper.updateByPrimaryKeySelective(course);
			return count;
		}
	   
		
		//删除课程
		public int deleteCourse(Long cId) {
			int count=courseMapper.deleteByPrimaryKey(cId);
			return count;
		}
	}




