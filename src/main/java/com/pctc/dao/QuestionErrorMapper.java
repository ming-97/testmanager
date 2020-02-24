package com.pctc.dao;

import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionErrorMapper {
    int countByExample(QuestionErrorExample example);

    int deleteByExample(QuestionErrorExample example);

    int deleteByPrimaryKey(Long qeId);

    int insert(QuestionError record);

    int insertSelective(QuestionError record);

    List<QuestionError> selectByExample(QuestionErrorExample example);

    QuestionError selectByPrimaryKey(Long qeId);

    int updateByExampleSelective(@Param("record") QuestionError record, @Param("example") QuestionErrorExample example);

    int updateByExample(@Param("record") QuestionError record, @Param("example") QuestionErrorExample example);

    int updateByPrimaryKeySelective(QuestionError record);

    int updateByPrimaryKey(QuestionError record);
}