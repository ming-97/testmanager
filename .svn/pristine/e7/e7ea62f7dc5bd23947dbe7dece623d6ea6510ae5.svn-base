package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.QuestionCourseChapterMapper;
import com.pctc.model.QuestionCourseChapter;
import com.pctc.model.QuestionCourseChapterExample;
import com.pctc.service.QuestionCourseChapterService;

/**
 * 对章节测试表进行操作
 * @author zw
 *
 */

@Service("questionChapterService")
@Transactional
public class QuestionCourseChapterServiceImpl implements QuestionCourseChapterService {

	@Autowired
	private QuestionCourseChapterMapper questionCourseChapterMapper;
	
	
	//添加章节测试题目
	public int insertQuestionChapter(QuestionCourseChapter chapter) {
		int count=questionCourseChapterMapper.insertSelective(chapter);
		return count;
	}

	
	//查询所有章节测试题目
	@Transactional(readOnly=true)
	public List<QuestionCourseChapter> selectAllQuestionCourseChapter(QuestionCourseChapterExample example) {
		List<QuestionCourseChapter> list=questionCourseChapterMapper.selectByExample(example);
		return list;
	}

	//根据id查询章节练习题目
	@Transactional(readOnly=true)
	public QuestionCourseChapter selectQuestionCourseChapter(Long qccId) {
			QuestionCourseChapter questionCourseChapter=questionCourseChapterMapper.selectByPrimaryKey(qccId);
		return questionCourseChapter;
	}

	//更新章节练习题目
	public int updateCourseChapter(QuestionCourseChapter questionCourseChapter) {
		int count=questionCourseChapterMapper.updateByPrimaryKeySelective(questionCourseChapter);
		return count;
	}
	
	
	
	
	
	
	

}
