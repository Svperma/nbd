package com.dsib.modules.business.cm.dao.crud.functionTypeMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.functionType.FunctionType;
import com.dsib.modules.business.cm.model.functionType.FunctionTypeExample;
import com.dsib.modules.business.cm.model.functionType.FunctionTypeKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface FunctionTypeMapper
{
    int countByExample(FunctionTypeExample example);

    int deleteByExample(FunctionTypeExample example);

    int deleteByPrimaryKey(FunctionTypeKey key);

    int insert(FunctionType record);

    int insertSelective(FunctionType record);

    List<FunctionType> selectByExample(FunctionTypeExample example);

    FunctionType selectByPrimaryKey(FunctionTypeKey key);

    int updateByExampleSelective(@Param("record") FunctionType record, @Param("example") FunctionTypeExample example);

    int updateByExample(@Param("record") FunctionType record, @Param("example") FunctionTypeExample example);

    int updateByPrimaryKeySelective(FunctionType record);

    int updateByPrimaryKey(FunctionType record);
}