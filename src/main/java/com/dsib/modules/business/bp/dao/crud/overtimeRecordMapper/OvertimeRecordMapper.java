package com.dsib.modules.business.bp.dao.crud.overtimeRecordMapper;

import java.util.List;

import com.dsib.modules.business.bp.model.overtimeRecord.OvertimeRecord;
import com.dsib.modules.business.bp.model.overtimeRecord.OvertimeRecordExample;
import com.dsib.modules.business.bp.model.overtimeRecord.OvertimeRecordKey;
import org.apache.ibatis.annotations.Param;

public interface OvertimeRecordMapper {
    int countByExample(OvertimeRecordExample example);

    int deleteByExample(OvertimeRecordExample example);

    int deleteByPrimaryKey(OvertimeRecordKey key);

    int insert(OvertimeRecord record);

    int insertSelective(OvertimeRecord record);

    List<OvertimeRecord> selectByExample(OvertimeRecordExample example);

    OvertimeRecord selectByPrimaryKey(OvertimeRecordKey key);

    int updateByExampleSelective(@Param("record") OvertimeRecord record, @Param("example") OvertimeRecordExample example);

    int updateByExample(@Param("record") OvertimeRecord record, @Param("example") OvertimeRecordExample example);

    int updateByPrimaryKeySelective(OvertimeRecord record);

    int updateByPrimaryKey(OvertimeRecord record);
}