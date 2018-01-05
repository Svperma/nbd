package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuBorrowMoney;

public interface GuBorrowMoneyMapper {
    int deleteByPrimaryKey(String borrowId);

    int insert(GuBorrowMoney record);

    int insertSelective(GuBorrowMoney record);

    GuBorrowMoney selectByPrimaryKey(String borrowId);

    int updateByPrimaryKeySelective(GuBorrowMoney record);

    int updateByPrimaryKey(GuBorrowMoney record);
}