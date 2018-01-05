package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgCredit;

public interface GgCreditMapper {
    int deleteByPrimaryKey(String creditId);

    int insert(GgCredit record);

    int insertSelective(GgCredit record);

    GgCredit selectByPrimaryKey(String creditId);

    int updateByPrimaryKeySelective(GgCredit record);

    int updateByPrimaryKey(GgCredit record);
}