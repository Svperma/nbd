package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuApplyMoney;

public interface GuApplyMoneyMapper {
    int deleteByPrimaryKey(String applyId);

    int insert(GuApplyMoney record);

    int insertSelective(GuApplyMoney record);

    GuApplyMoney selectByPrimaryKey(String applyId);

    int updateByPrimaryKeySelective(GuApplyMoney record);

    int updateByPrimaryKey(GuApplyMoney record);
}