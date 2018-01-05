package com.dsib.modules.business.cm.model.duty.bo;

import com.dsib.common.bo.BaseQueryBo;

public class CmDutyQueryBo extends BaseQueryBo {

    private String dutyName;

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }
}
