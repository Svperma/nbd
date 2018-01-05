package com.dsib.modules.business.cm.model.overtimeTime.bo;

import com.dsib.common.bo.BaseQueryBo;

public class OvertimeTimeQueryBo extends BaseQueryBo {
    private  String overtimetimeName;

    public String getOvertimetimeName() {
        return overtimetimeName;
    }

    public void setOvertimetimeName(String overtimetimeName) {
        this.overtimetimeName = overtimetimeName;
    }
}
