package com.pctc.dao;

import com.pctc.model.Permissions;
import com.pctc.model.PermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionsMapper {
    int countByExample(PermissionsExample example);

    int deleteByExample(PermissionsExample example);

    int deleteByPrimaryKey(Long pId);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    List<Permissions> selectByExample(PermissionsExample example);

    Permissions selectByPrimaryKey(Long pId);

    int updateByExampleSelective(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByExample(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}