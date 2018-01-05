package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgResource;

public interface GgResourceMapper {
    int deleteByPrimaryKey(String resourceId);

    int insert(GgResource record);

    int insertSelective(GgResource record);

    GgResource selectByPrimaryKey(String resourceId);

    int updateByPrimaryKeySelective(GgResource record);

    int updateByPrimaryKey(GgResource record);
}