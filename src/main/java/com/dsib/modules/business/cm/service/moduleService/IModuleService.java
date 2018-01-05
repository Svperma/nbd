package com.dsib.modules.business.cm.service.moduleService;

import com.dsib.common.services.IBaseService;
import com.dsib.modules.business.cm.model.module.bo.ModuleDvol;

import java.util.List;

public interface IModuleService<ModuleKey, Module, ModuleExample> extends IBaseService<ModuleKey, Module, ModuleExample> {
    int insertOrtherTest(Module record);

    List<ModuleDvol> selectModuleList(ModuleExample example);
}
