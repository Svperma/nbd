package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgLetter;

public interface GgLetterMapper {
    int deleteByPrimaryKey(String letterId);

    int insert(GgLetter record);

    int insertSelective(GgLetter record);

    GgLetter selectByPrimaryKey(String letterId);

    int updateByPrimaryKeySelective(GgLetter record);

    int updateByPrimaryKey(GgLetter record);
}