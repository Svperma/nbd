package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgContract;

public interface GgContractMapper {
    int deleteByPrimaryKey(String contractId);

    int insert(GgContract record);

    int insertSelective(GgContract record);

    GgContract selectByPrimaryKey(String contractId);

    int updateByPrimaryKeySelective(GgContract record);

    int updateByPrimaryKey(GgContract record);
}