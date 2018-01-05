package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuPolicyMain;

public interface GuPolicyMainMapper {
    int deleteByPrimaryKey(String businessNo);

    int insert(GuPolicyMain record);

    int insertSelective(GuPolicyMain record);

    GuPolicyMain selectByPrimaryKey(String businessNo);

    int updateByPrimaryKeySelective(GuPolicyMain record);

    int updateByPrimaryKey(GuPolicyMain record);
}