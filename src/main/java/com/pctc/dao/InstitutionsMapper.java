package com.pctc.dao;

import com.pctc.model.Institutions;
import com.pctc.model.InstitutionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstitutionsMapper {
    int countByExample(InstitutionsExample example);

    int deleteByExample(InstitutionsExample example);

    int deleteByPrimaryKey(Long insId);

    int insert(Institutions record);

    int insertSelective(Institutions record);

    List<Institutions> selectByExample(InstitutionsExample example);

    Institutions selectByPrimaryKey(Long insId);

    int updateByExampleSelective(@Param("record") Institutions record, @Param("example") InstitutionsExample example);

    int updateByExample(@Param("record") Institutions record, @Param("example") InstitutionsExample example);

    int updateByPrimaryKeySelective(Institutions record);

    int updateByPrimaryKey(Institutions record);
}