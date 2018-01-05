package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgFinancial;

public interface GgFinancialMapper {
    int deleteByPrimaryKey(String id);

    int insert(GgFinancial record);

    int insertSelective(GgFinancial record);

    GgFinancial selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GgFinancial record);

    int updateByPrimaryKey(GgFinancial record);
}