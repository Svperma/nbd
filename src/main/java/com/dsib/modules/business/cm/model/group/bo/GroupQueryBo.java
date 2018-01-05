package com.dsib.modules.business.cm.model.group.bo;

import com.dsib.common.bo.BaseQueryBo;

public class GroupQueryBo extends BaseQueryBo {
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
