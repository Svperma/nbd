package com.dsib.modules.business.cm.service.functionTypeService;

import com.dsib.common.services.IBaseService;

public interface IFunctionTypeService<FunctionTypeKey, FunctionType, FunctionTypeExample> extends IBaseService<FunctionTypeKey, FunctionType, FunctionTypeExample> {

    int insertOrtherTest(FunctionType record);
}
