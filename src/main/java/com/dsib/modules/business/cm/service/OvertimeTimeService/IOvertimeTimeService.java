package com.dsib.modules.business.cm.service.OvertimeTimeService;

import com.dsib.common.services.IBaseService;

public interface IOvertimeTimeService<OvertimeTimeKey, OvertimeTime, OvertimeTimeExample> extends IBaseService<OvertimeTimeKey, OvertimeTime, OvertimeTimeExample> {
    int insertOrtherTest(OvertimeTime record);
}
