package com.dsib.modules.business.bp.dao.crud.conferenceRecordMapper;

import java.util.List;

import com.dsib.modules.business.bp.model.conferenceRecord.ConferenceRecord;
import com.dsib.modules.business.bp.model.conferenceRecord.ConferenceRecordExample;
import com.dsib.modules.business.bp.model.conferenceRecord.ConferenceRecordKey;
import org.apache.ibatis.annotations.Param;

public interface ConferenceRecordMapper {
    int countByExample(ConferenceRecordExample example);

    int deleteByExample(ConferenceRecordExample example);

    int deleteByPrimaryKey(ConferenceRecordKey key);

    int insert(ConferenceRecord record);

    int insertSelective(ConferenceRecord record);

    List<ConferenceRecord> selectByExample(ConferenceRecordExample example);

    ConferenceRecord selectByPrimaryKey(ConferenceRecordKey key);

    int updateByExampleSelective(@Param("record") ConferenceRecord record, @Param("example") ConferenceRecordExample example);

    int updateByExample(@Param("record") ConferenceRecord record, @Param("example") ConferenceRecordExample example);

    int updateByPrimaryKeySelective(ConferenceRecord record);

    int updateByPrimaryKey(ConferenceRecord record);
}