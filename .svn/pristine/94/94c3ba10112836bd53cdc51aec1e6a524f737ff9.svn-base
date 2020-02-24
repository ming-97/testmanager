package com.pctc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.QuestionPaperMapper;
import com.pctc.model.QuestionPaper;
import com.pctc.model.QuestionPaperExample;
import com.pctc.service.QuestionPaperService;


/**
 * 答题信息service的实现
 * @author zks
 * @date 2019-10-16
 * @version 0.1
 */

@Service("questionPaperService")
@Transactional
public class QuestionPaperServiceImpl implements QuestionPaperService {
	
	
	@Autowired
	private QuestionPaperMapper questionPaperMapper;

	
	//1.查询所有的实现
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public List<QuestionPaper> getAllQuestionPaper(QuestionPaperExample questionPaperExample) {
		List<QuestionPaper> questionPaperList=questionPaperMapper.selectByExample(questionPaperExample);
		return questionPaperList;
	}

	
	//2.添加答题信息的实现
	public int addQuestionPaper(QuestionPaper questionPaper) {
		int recordNumber=questionPaperMapper.insertSelective(questionPaper);
		return recordNumber;
	}

	
	//3.根据id删除答题信息的实现
	public int deleteQuestionPaper(Long qpId) {
		int recordNumber=questionPaperMapper.deleteByPrimaryKey(qpId);
		return recordNumber;
	}

	
	//4.修改答题信息的时间实现
	public int updateQuestionPaper(QuestionPaper questionPaper) {
		int recordNumber=questionPaperMapper.updateByPrimaryKeySelective(questionPaper);
		return recordNumber;
	}


	//5.根据id查询错题信息实现
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public QuestionPaper getQuestionPaperById(Long qpId) {
		QuestionPaper questionPaper=questionPaperMapper.selectByPrimaryKey(qpId);
		return questionPaper;
	}

}
