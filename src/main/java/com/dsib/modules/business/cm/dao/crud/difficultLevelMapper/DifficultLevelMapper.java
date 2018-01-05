package com.dsib.modules.business.cm.dao.crud.difficultLevelMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.difficultLevel.DifficultLevel;
import com.dsib.modules.business.cm.model.difficultLevel.DifficultLevelExample;
import com.dsib.modules.business.cm.model.difficultLevel.DifficultLevelKey;
import org.apache.ibatis.annotations.Param;

public interface DifficultLevelMapper {
    int countByExample(DifficultLevelExample example);

    int deleteByExample(DifficultLevelExample example);

    int deleteByPrimaryKey(DifficultLevelKey key);

    int insert(DifficultLevel record);

    int insertSelective(DifficultLevel record);

    List<DifficultLevel> selectByExample(DifficultLevelExample example);

    DifficultLevel selectByPrimaryKey(DifficultLevelKey key);

    int updateByExampleSelective(@Param("record") DifficultLevel record, @Param("example") DifficultLevelExample example);

    int updateByExample(@Param("record") DifficultLevel record, @Param("example") DifficultLevelExample example);

    int updateByPrimaryKeySelective(DifficultLevel record);

    int updateByPrimaryKey(DifficultLevel record);
}