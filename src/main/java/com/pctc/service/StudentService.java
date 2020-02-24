package com.pctc.service;

import java.util.List;

import com.pctc.model.Student;
import com.pctc.model.StudentExample;

public interface StudentService {

	// ������ѯ����ѧ��,StudentExample������
	public List<Student> getStudent(StudentExample example);

	// ���ѧ��
	public int addStudent(Student student);

	// ����id��ѯѧ��
	public Student getStudent(Long sId);

	// �޸�ѧ��
	public int updateStudent(Student student);

	// ɾ��ѧ��
	public int deleteStudent(Long sId);
}
