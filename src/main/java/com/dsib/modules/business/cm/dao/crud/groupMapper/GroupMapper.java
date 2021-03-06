package com.dsib.modules.business.cm.dao.crud.groupMapper;
import java.util.List;

import com.dsib.modules.business.cm.model.group.Group;
import com.dsib.modules.business.cm.model.group.GroupExample;
import com.dsib.modules.business.cm.model.group.GroupKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper
{
    int countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(GroupKey key);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(GroupKey key);

    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}