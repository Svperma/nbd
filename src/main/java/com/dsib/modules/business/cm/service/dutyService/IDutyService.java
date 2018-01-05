package com.dsib.modules.business.cm.service.dutyService;

import com.dsib.common.services.IBaseService;

public interface IDutyService<DutyKey, Duty, DutyExample> extends IBaseService<DutyKey, Duty, DutyExample> {
    int insertOrtherTest(Duty record);
}
