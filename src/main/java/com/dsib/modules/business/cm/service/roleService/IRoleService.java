package com.dsib.modules.business.cm.service.roleService;

import com.dsib.common.services.IBaseService;

public interface IRoleService<RoleKey, Role, RoleExample> extends IBaseService<RoleKey, Role, RoleExample> {
    int insertOrtherTest(Role record);
}
