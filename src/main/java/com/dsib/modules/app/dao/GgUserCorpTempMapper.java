package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgUserCorpTemp;

public interface GgUserCorpTempMapper {
    int deleteByPrimaryKey(String userId);

    int insert(GgUserCorpTemp record);

    int insertSelective(GgUserCorpTemp record);

    GgUserCorpTemp selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(GgUserCorpTemp record);

    int updateByPrimaryKey(GgUserCorpTemp record);
}