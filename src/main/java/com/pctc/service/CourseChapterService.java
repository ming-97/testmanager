package com.pctc.service;

import java.util.List;

import com.pctc.model.CourseChapter;
import com.pctc.model.CourseChapterExample;

/**
 * 
 * @author zw
 *
 */
public interface CourseChapterService {
	
	//��Ѱ�����½�
	public List<CourseChapter> selectAllCourseChapter(CourseChapterExample example);
	
	//�������ֲ����½ں�
	public CourseChapter selectCourseChapterByName(String name);
	
	
	//�����½�
	public int addCourseChapter(CourseChapter courseChapter);
	
	//�޸��½�
	public int updataCourseChapter(CourseChapter courseChapter);
	
	//ɾ���½�
	public int deleteCourseChapter(Long ccId);
	
}