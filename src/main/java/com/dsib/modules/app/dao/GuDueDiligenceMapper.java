package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuDueDiligence;

public interface GuDueDiligenceMapper {
    int deleteByPrimaryKey(String dueId);

    int insert(GuDueDiligence record);

    int insertSelective(GuDueDiligence record);

    GuDueDiligence selectByPrimaryKey(String dueId);

    int updateByPrimaryKeySelective(GuDueDiligence record);

    int updateByPrimaryKey(GuDueDiligence record);
}