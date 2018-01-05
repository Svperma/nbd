package com.dsib.modules.app.service;

import com.dsib.modules.app.entity.GgUser;

/**
 * 用户
 *
 * @author
 * @date 2018-01-04
 */
public interface GgUserService {
    int deleteByPrimaryKey(String userId);

    int insert(GgUser record);

    int insertSelective(GgUser record);

    GgUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(GgUser record);

    int updateByPrimaryKey(GgUser record);
}
