package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgManagerCard;

public interface GgManagerCardMapper {
    int deleteByPrimaryKey(String cardId);

    int insert(GgManagerCard record);

    int insertSelective(GgManagerCard record);

    GgManagerCard selectByPrimaryKey(String cardId);

    int updateByPrimaryKeySelective(GgManagerCard record);

    int updateByPrimaryKey(GgManagerCard record);
}