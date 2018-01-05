package com.dsib.modules.business.cm.service.bugStateService;

import com.dsib.common.services.IBaseService;

public interface IBugStateService<BugStateKey, BugState, BugStateExample> extends IBaseService<BugStateKey, BugState, BugStateExample> {

    int insertOrtherTest(BugState record);
}
