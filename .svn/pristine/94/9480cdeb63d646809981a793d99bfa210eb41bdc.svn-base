package com.pctc.dao;

import com.pctc.model.QuestionCourseChapter;
import com.pctc.model.QuestionCourseChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionCourseChapterMapper {
    int countByExample(QuestionCourseChapterExample example);

    int deleteByExample(QuestionCourseChapterExample example);

    int deleteByPrimaryKey(Long qccId);

    int insert(QuestionCourseChapter record);

    int insertSelective(QuestionCourseChapter record);

    List<QuestionCourseChapter> selectByExample(QuestionCourseChapterExample example);

    QuestionCourseChapter selectByPrimaryKey(Long qccId);

    int updateByExampleSelective(@Param("record") QuestionCourseChapter record, @Param("example") QuestionCourseChapterExample example);

    int updateByExample(@Param("record") QuestionCourseChapter record, @Param("example") QuestionCourseChapterExample example);

    int updateByPrimaryKeySelective(QuestionCourseChapter record);

    int updateByPrimaryKey(QuestionCourseChapter record);
}