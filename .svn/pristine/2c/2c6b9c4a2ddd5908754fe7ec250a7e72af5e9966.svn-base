package com.pctc.dao;

import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionDailyMapper {
    int countByExample(QuestionDailyExample example);

    int deleteByExample(QuestionDailyExample example);

    int deleteByPrimaryKey(Long qdId);

    int insert(QuestionDaily record);

    int insertSelective(QuestionDaily record);

    List<QuestionDaily> selectByExample(QuestionDailyExample example);

    QuestionDaily selectByPrimaryKey(Long qdId);

    int updateByExampleSelective(@Param("record") QuestionDaily record, @Param("example") QuestionDailyExample example);

    int updateByExample(@Param("record") QuestionDaily record, @Param("example") QuestionDailyExample example);

    int updateByPrimaryKeySelective(QuestionDaily record);

    int updateByPrimaryKey(QuestionDaily record);
    
    
   /* //1.根据每日一练id查询所包含的试题id信息（多表查询： 使用collection分步实现）（嵌套查询）
    public QuestionDaily getQuestionDailyQuestionIdById(Long qdId);*/
}