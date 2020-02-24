package com.pctc.dao;

import com.pctc.model.QuestionCourse;
import com.pctc.model.QuestionCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionCourseMapper {
    int countByExample(QuestionCourseExample example);

    int deleteByExample(QuestionCourseExample example);

    int deleteByPrimaryKey(Long qcId);

    int insert(QuestionCourse record);

    int insertSelective(QuestionCourse record);

    List<QuestionCourse> selectByExample(QuestionCourseExample example);

    QuestionCourse selectByPrimaryKey(Long qcId);

    int updateByExampleSelective(@Param("record") QuestionCourse record, @Param("example") QuestionCourseExample example);

    int updateByExample(@Param("record") QuestionCourse record, @Param("example") QuestionCourseExample example);

    int updateByPrimaryKeySelective(QuestionCourse record);

    int updateByPrimaryKey(QuestionCourse record);
}