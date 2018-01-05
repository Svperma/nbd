package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuAssurance;

public interface GuAssuranceMapper {
    int deleteByPrimaryKey(String assureId);

    int insert(GuAssurance record);

    int insertSelective(GuAssurance record);

    GuAssurance selectByPrimaryKey(String assureId);

    int updateByPrimaryKeySelective(GuAssurance record);

    int updateByPrimaryKey(GuAssurance record);
}