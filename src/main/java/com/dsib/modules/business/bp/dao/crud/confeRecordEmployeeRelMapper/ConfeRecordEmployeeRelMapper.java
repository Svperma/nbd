package com.dsib.modules.business.bp.dao.crud.confeRecordEmployeeRelMapper;

import java.util.List;

import com.dsib.modules.business.bp.model.confeRecordEmployeeRel.ConfeRecordEmployeeRel;
import com.dsib.modules.business.bp.model.confeRecordEmployeeRel.ConfeRecordEmployeeRelExample;
import com.dsib.modules.business.bp.model.confeRecordEmployeeRel.ConfeRecordEmployeeRelKey;
import org.apache.ibatis.annotations.Param;

public interface ConfeRecordEmployeeRelMapper {
    int countByExample(ConfeRecordEmployeeRelExample example);

    int deleteByExample(ConfeRecordEmployeeRelExample example);

    int deleteByPrimaryKey(ConfeRecordEmployeeRelKey key);

    int insert(ConfeRecordEmployeeRel record);

    int insertSelective(ConfeRecordEmployeeRel record);

    List<ConfeRecordEmployeeRel> selectByExample(ConfeRecordEmployeeRelExample example);

    ConfeRecordEmployeeRel selectByPrimaryKey(ConfeRecordEmployeeRelKey key);

    int updateByExampleSelective(@Param("record") ConfeRecordEmployeeRel record, @Param("example") ConfeRecordEmployeeRelExample example);

    int updateByExample(@Param("record") ConfeRecordEmployeeRel record, @Param("example") ConfeRecordEmployeeRelExample example);

    int updateByPrimaryKeySelective(ConfeRecordEmployeeRel record);

    int updateByPrimaryKey(ConfeRecordEmployeeRel record);
}