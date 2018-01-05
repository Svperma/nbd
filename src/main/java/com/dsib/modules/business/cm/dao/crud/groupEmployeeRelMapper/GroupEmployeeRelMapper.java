package com.dsib.modules.business.cm.dao.crud.groupEmployeeRelMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.groupEmployeeRel.GroupEmployeeRel;
import com.dsib.modules.business.cm.model.groupEmployeeRel.GroupEmployeeRelExample;
import com.dsib.modules.business.cm.model.groupEmployeeRel.GroupEmployeeRelKey;
import org.apache.ibatis.annotations.Param;

public interface GroupEmployeeRelMapper {
    int countByExample(GroupEmployeeRelExample example);

    int deleteByExample(GroupEmployeeRelExample example);

    int deleteByPrimaryKey(GroupEmployeeRelKey key);

    int insert(GroupEmployeeRel record);

    int insertSelective(GroupEmployeeRel record);

    List<GroupEmployeeRel> selectByExample(GroupEmployeeRelExample example);

    GroupEmployeeRel selectByPrimaryKey(GroupEmployeeRelKey key);

    int updateByExampleSelective(@Param("record") GroupEmployeeRel record, @Param("example") GroupEmployeeRelExample example);

    int updateByExample(@Param("record") GroupEmployeeRel record, @Param("example") GroupEmployeeRelExample example);

    int updateByPrimaryKeySelective(GroupEmployeeRel record);

    int updateByPrimaryKey(GroupEmployeeRel record);
}