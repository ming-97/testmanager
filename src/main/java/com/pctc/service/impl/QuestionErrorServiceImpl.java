package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.ls.LSInput;

import com.pctc.dao.QuestionErrorMapper;
import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;
import com.pctc.service.QuestionErrorService;
/**
 * 错题表service实现
 * @author zks
 * @date 2019-10-17
 * @version 0.1
 *
 */
@Service("questionErrorService")
@Transactional
public class QuestionErrorServiceImpl implements QuestionErrorService {
	
	@Autowired
	private QuestionErrorMapper questionErrorMapper;

	
	//1.查询所有的实现
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public List<QuestionError> getAllQuesionError(QuestionErrorExample questionErrorExample) {
		List <QuestionError> questionErrorList=questionErrorMapper.selectByExample(questionErrorExample);
		return questionErrorList;
	}

	
	//2.增加错题的实现
	public int addQuestionError(QuestionError questionError) {
		int recordNumber=questionErrorMapper.insertSelective(questionError);
		return recordNumber;
	}


	//3.删除错题的实现
	public int deleteQuestionError(Long qeId) {
		int recordNumber=questionErrorMapper.deleteByPrimaryKey(qeId);
		return recordNumber;
	}
	

	//4.修改错题的实现
	public int updateQuestionError(QuestionError questionError) {
		int recordNumber=questionErrorMapper.updateByPrimaryKeySelective(questionError);
		return recordNumber;
	}

	
	//5.根据id查询错题
	@Transactional(readOnly=true)  //事务注解：不需要对数据库数据进行操作，只是进行读操作
	public QuestionError getQuestionErrorById(Long qeId) {
		QuestionError questionError=questionErrorMapper.selectByPrimaryKey(qeId);
		return questionError;
	}
	
	
	
	
	
	
	
}
