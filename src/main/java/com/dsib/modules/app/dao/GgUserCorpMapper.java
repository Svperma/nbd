package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgUserCorp;

public interface GgUserCorpMapper {
    int deleteByPrimaryKey(String userId);

    int insert(GgUserCorp record);

    int insertSelective(GgUserCorp record);

    GgUserCorp selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(GgUserCorp record);

    int updateByPrimaryKey(GgUserCorp record);
}