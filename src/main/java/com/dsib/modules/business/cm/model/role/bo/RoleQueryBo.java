package com.dsib.modules.business.cm.model.role.bo;

import com.dsib.common.bo.BaseQueryBo;

public class RoleQueryBo extends BaseQueryBo {

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
