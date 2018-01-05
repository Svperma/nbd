package com.dsib.modules.business.cm.model.bugState.bo;

import com.dsib.common.bo.BaseQueryBo;

public class BugStateQueryBo extends BaseQueryBo {

    private String bugStateName;

    public String getBugStateName() {
        return bugStateName;
    }

    public void setBugStateName(String bugStateName) {
        this.bugStateName = bugStateName;
    }
}
