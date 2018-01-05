package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgProduct;

public interface GgProductMapper {
    int deleteByPrimaryKey(String productId);

    int insert(GgProduct record);

    int insertSelective(GgProduct record);

    GgProduct selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(GgProduct record);

    int updateByPrimaryKey(GgProduct record);
}