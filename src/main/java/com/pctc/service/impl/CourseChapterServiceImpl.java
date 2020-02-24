package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.CourseChapterMapper;
import com.pctc.model.CourseChapter;
import com.pctc.model.CourseChapterExample;
import com.pctc.model.CourseChapterExample.Criteria;
import com.pctc.service.CourseChapterService;

/**
 * 
 * @author zw
 *
 */
@Service("courseChapterService")
@Transactional
public class CourseChapterServiceImpl implements CourseChapterService {

	@Autowired
	private CourseChapterMapper courseChapterMapper;
	
	
	//��ѯ�����½�
	@Transactional(readOnly=true)
	public List<CourseChapter> selectAllCourseChapter(CourseChapterExample example) {
		Criteria criteria=example.createCriteria();
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> list=courseChapterMapper.selectByExample(example);
		return list;
	}

      //����½�
	public int addCourseChapter(CourseChapter courseChapter) {
		int count=courseChapterMapper.insertSelective(courseChapter);
		return count;
	}

	//�޸��½�
	public int updataCourseChapter(CourseChapter courseChapter) {
		int count=courseChapterMapper.updateByPrimaryKeySelective(courseChapter);
		return count;
	}

	//ɾ���½�
	public int deleteCourseChapter(Long ccId) {
		int count=courseChapterMapper.deleteByPrimaryKey(ccId);
		return count;
	}

	//�����½�����ѯ�½�
	@Transactional(readOnly=true)
	public CourseChapter selectCourseChapterByName(String name) {
		CourseChapterExample example=new CourseChapterExample();
		Criteria criteria=example.createCriteria();
		criteria.andCcDeleteEqualTo(false);
		criteria.andCcNameEqualTo(name);
		CourseChapter chapter1=courseChapterMapper.selectByExample(example).get(0);//�����ҵ��ĵ�һ����Ϣ����
		return chapter1;
	}



}
