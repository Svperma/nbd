package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgAuditRecord;
import com.dsib.modules.app.entity.GgAuditRecordKey;

public interface GgAuditRecordMapper {
    int deleteByPrimaryKey(GgAuditRecordKey key);

    int insert(GgAuditRecord record);

    int insertSelective(GgAuditRecord record);

    GgAuditRecord selectByPrimaryKey(GgAuditRecordKey key);

    int updateByPrimaryKeySelective(GgAuditRecord record);

    int updateByPrimaryKey(GgAuditRecord record);
}