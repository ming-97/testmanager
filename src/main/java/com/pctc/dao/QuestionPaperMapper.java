package com.pctc.dao;

import com.pctc.model.QuestionPaper;
import com.pctc.model.QuestionPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionPaperMapper {
    int countByExample(QuestionPaperExample example);

    int deleteByExample(QuestionPaperExample example);

    int deleteByPrimaryKey(Long qpId);

    int insert(QuestionPaper record);

    int insertSelective(QuestionPaper record);

    List<QuestionPaper> selectByExample(QuestionPaperExample example);

    QuestionPaper selectByPrimaryKey(Long qpId);

    int updateByExampleSelective(@Param("record") QuestionPaper record, @Param("example") QuestionPaperExample example);

    int updateByExample(@Param("record") QuestionPaper record, @Param("example") QuestionPaperExample example);

    int updateByPrimaryKeySelective(QuestionPaper record);

    int updateByPrimaryKey(QuestionPaper record);
}