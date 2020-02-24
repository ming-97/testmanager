package com.pctc.service;

import java.util.List;

import com.pctc.model.Student;
import com.pctc.model.StudentExample;

public interface TeacherStudentService {

	// ������ѯ����ѧ��,StudentExample������
	public List<Student> getStudent(StudentExample example);

	// ���ѧ��
	public int addStudent(Student student);

	// ����id��ѯѧ��
	public Student getStudent(Long sId);

	// �޸�ѧ��
	public int updateStudent(Student student);

	// ��ɾ��ѧ��
	public int deleteStudentTrue(Long sId);
	
	
	
	
	// ��ɾ��ѧ��
	public int deleteStudentFalse(Long sId);
}
