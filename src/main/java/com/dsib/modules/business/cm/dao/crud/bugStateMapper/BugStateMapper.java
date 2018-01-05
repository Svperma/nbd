package com.dsib.modules.business.cm.dao.crud.bugStateMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.bugState.BugState;
import com.dsib.modules.business.cm.model.bugState.BugStateExample;
import com.dsib.modules.business.cm.model.bugState.BugStateKey;
import org.apache.ibatis.annotations.Param;

public interface BugStateMapper {
    int countByExample(BugStateExample example);

    int deleteByExample(BugStateExample example);

    int deleteByPrimaryKey(BugStateKey key);

    int insert(BugState record);

    int insertSelective(BugState record);

    List<BugState> selectByExample(BugStateExample example);

    BugState selectByPrimaryKey(BugStateKey key);

    int updateByExampleSelective(@Param("record") BugState record, @Param("example") BugStateExample example);

    int updateByExample(@Param("record") BugState record, @Param("example") BugStateExample example);

    int updateByPrimaryKeySelective(BugState record);

    int updateByPrimaryKey(BugState record);
}