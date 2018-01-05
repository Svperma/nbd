package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgProductDetail;

public interface GgProductDetailMapper {
    int deleteByPrimaryKey(String productId);

    int insert(GgProductDetail record);

    int insertSelective(GgProductDetail record);

    GgProductDetail selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(GgProductDetail record);

    int updateByPrimaryKey(GgProductDetail record);
}