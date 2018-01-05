package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgRole;

public interface GgRoleMapper {
    int deleteByPrimaryKey(String roleCode);

    int insert(GgRole record);

    int insertSelective(GgRole record);

    GgRole selectByPrimaryKey(String roleCode);

    int updateByPrimaryKeySelective(GgRole record);

    int updateByPrimaryKey(GgRole record);
}