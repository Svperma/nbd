package com.dsib.modules.business.bp.service.overtimeRecordService;

import com.dsib.common.services.IBaseService;
import com.dsib.modules.business.bp.model.overtimeRecord.bo.OvertimeRecordDvol;

import java.util.List;

public interface IOvertimeRecordService<OvertimeRecordKey, OvertimeRecord, OvertimeRecordExample>
        extends IBaseService<OvertimeRecordKey, OvertimeRecord, OvertimeRecordExample> {

    int insertOrtherTest(OvertimeRecord record);

    List<OvertimeRecordDvol> selectOvertimeRecordList(OvertimeRecordExample example);
}
