package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgCompanyProduct;

public interface GgCompanyProductMapper {
    int deleteByPrimaryKey(String productId);

    int insert(GgCompanyProduct record);

    int insertSelective(GgCompanyProduct record);

    GgCompanyProduct selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(GgCompanyProduct record);

    int updateByPrimaryKey(GgCompanyProduct record);
}