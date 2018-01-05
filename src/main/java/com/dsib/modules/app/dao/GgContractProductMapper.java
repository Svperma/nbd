package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgContractProduct;

public interface GgContractProductMapper {
    int deleteByPrimaryKey(String id);

    int insert(GgContractProduct record);

    int insertSelective(GgContractProduct record);

    GgContractProduct selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GgContractProduct record);

    int updateByPrimaryKey(GgContractProduct record);
}