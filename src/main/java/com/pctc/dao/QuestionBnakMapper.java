package com.pctc.dao;

import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionBnakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionBnakMapper {
    int countByExample(QuestionBnakExample example);

    int deleteByExample(QuestionBnakExample example);

    int deleteByPrimaryKey(Long qbId);

    int insert(QuestionBnak record);

    int insertSelective(QuestionBnak record);

    List<QuestionBnak> selectByExample(QuestionBnakExample example);

    QuestionBnak selectByPrimaryKey(Long qbId);

    int updateByExampleSelective(@Param("record") QuestionBnak record, @Param("example") QuestionBnakExample example);

    int updateByExample(@Param("record") QuestionBnak record, @Param("example") QuestionBnakExample example);

    int updateByPrimaryKeySelective(QuestionBnak record);

    int updateByPrimaryKey(QuestionBnak record);
}