package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuPayNotice;
import com.dsib.modules.app.entity.GuPayNoticeKey;

public interface GuPayNoticeMapper {
    int deleteByPrimaryKey(GuPayNoticeKey key);

    int insert(GuPayNotice record);

    int insertSelective(GuPayNotice record);

    GuPayNotice selectByPrimaryKey(GuPayNoticeKey key);

    int updateByPrimaryKeySelective(GuPayNotice record);

    int updateByPrimaryKey(GuPayNotice record);
}