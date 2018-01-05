package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuDueDetail;
import com.dsib.modules.app.entity.GuDueDetailKey;

public interface GuDueDetailMapper {
    int deleteByPrimaryKey(GuDueDetailKey key);

    int insert(GuDueDetail record);

    int insertSelective(GuDueDetail record);

    GuDueDetail selectByPrimaryKey(GuDueDetailKey key);

    int updateByPrimaryKeySelective(GuDueDetail record);

    int updateByPrimaryKey(GuDueDetail record);
}