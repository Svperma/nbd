package com.dsib.modules.business.cm.dao.crud.moduleMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.module.Module;
import com.dsib.modules.business.cm.model.module.ModuleExample;
import com.dsib.modules.business.cm.model.module.ModuleKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface ModuleMapper
{
    int countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(ModuleKey key);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(ModuleKey key);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}