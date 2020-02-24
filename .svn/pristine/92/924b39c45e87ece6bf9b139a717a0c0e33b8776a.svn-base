package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.StudentMapper;
import com.pctc.model.Student;
import com.pctc.model.StudentExample;
import com.pctc.service.TeacherStudentService;

@Service("teacherStudentService")
@Transactional // 事务处理
public class TeacherStudentServiceImpl implements TeacherStudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Transactional(readOnly = true) // 只读，不做事务处理。
	public List<Student> getStudent(StudentExample example) {
		List<Student> students = studentMapper.selectByExample(example);
		return students;
	}

	public int addStudent(Student student) {
		int count = 0;
		if (student != null) {
			count = studentMapper.insertSelective(student);
		}
		return count;
	}

	@Transactional(readOnly = true)
	public Student getStudent(Long sId) {
		Student student = null;
		if (sId != null) {
			student = studentMapper.selectByPrimaryKey(sId);
		}
		return student;
	}

	public int updateStudent(Student student) {
		int count = 0;
		count = studentMapper.updateByPrimaryKey(student);
		return count;
	}

	public int deleteStudentTrue(Long sId) {
		int count = studentMapper.deleteByPrimaryKey(sId);
		return count;
	}

	public int deleteStudentFalse(Long sId) {
		int count = 0;
		Student student = null;		
		student = studentMapper.selectByPrimaryKey(sId);
		if (student != null) {
			student.setsDelete(true);
			count = studentMapper.updateByPrimaryKey(student);
		}

		return count;
	}

}
