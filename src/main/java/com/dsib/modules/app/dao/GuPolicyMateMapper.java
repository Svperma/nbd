package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuPolicyMate;

public interface GuPolicyMateMapper {
    int deleteByPrimaryKey(String businessNo);

    int insert(GuPolicyMate record);

    int insertSelective(GuPolicyMate record);

    GuPolicyMate selectByPrimaryKey(String businessNo);

    int updateByPrimaryKeySelective(GuPolicyMate record);

    int updateByPrimaryKey(GuPolicyMate record);
}