package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户dao
 * @author xjg
 *
 */
@Mapper
public interface GgUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(GgUser record);

    int insertSelective(GgUser record);

    GgUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(GgUser record);

    int updateByPrimaryKey(GgUser record);
}