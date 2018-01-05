package com.dsib.modules.business.cm.service.difficultLevelService;

import com.dsib.common.services.IBaseService;

public interface IDifficultLevelService<DifficultLevelKey, DifficultLevel, DifficultLevelExample>extends IBaseService<DifficultLevelKey, DifficultLevel, DifficultLevelExample> {

    int insertOrtherTest(DifficultLevel record);
}
