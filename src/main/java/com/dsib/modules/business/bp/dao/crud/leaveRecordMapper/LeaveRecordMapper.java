package com.dsib.modules.business.bp.dao.crud.leaveRecordMapper;

import java.util.List;

import com.dsib.modules.business.bp.model.leaveRecord.LeaveRecord;
import com.dsib.modules.business.bp.model.leaveRecord.LeaveRecordExample;
import com.dsib.modules.business.bp.model.leaveRecord.LeaveRecordKey;
import org.apache.ibatis.annotations.Param;

public interface LeaveRecordMapper {
    int countByExample(LeaveRecordExample example);

    int deleteByExample(LeaveRecordExample example);

    int deleteByPrimaryKey(LeaveRecordKey key);

    int insert(LeaveRecord record);

    int insertSelective(LeaveRecord record);

    List<LeaveRecord> selectByExample(LeaveRecordExample example);

    LeaveRecord selectByPrimaryKey(LeaveRecordKey key);

    int updateByExampleSelective(@Param("record") LeaveRecord record, @Param("example") LeaveRecordExample example);

    int updateByExample(@Param("record") LeaveRecord record, @Param("example") LeaveRecordExample example);

    int updateByPrimaryKeySelective(LeaveRecord record);

    int updateByPrimaryKey(LeaveRecord record);
}