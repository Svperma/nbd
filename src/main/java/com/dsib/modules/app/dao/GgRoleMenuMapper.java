package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgRoleMenu;
import com.dsib.modules.app.entity.GgRoleMenuKey;

public interface GgRoleMenuMapper {
    int deleteByPrimaryKey(GgRoleMenuKey key);

    int insert(GgRoleMenu record);

    int insertSelective(GgRoleMenu record);

    GgRoleMenu selectByPrimaryKey(GgRoleMenuKey key);

    int updateByPrimaryKeySelective(GgRoleMenu record);

    int updateByPrimaryKey(GgRoleMenu record);
}