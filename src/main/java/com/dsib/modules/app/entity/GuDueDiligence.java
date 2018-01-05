package com.dsib.modules.app.entity;

import java.util.Date;

public class GuDueDiligence {
    private String dueId;

    private String userId;

    private String dueCode;

    private String dueType;

    private String dueReport;

    private Date creditTime;

    private String remark;

    private String flag;

    private String contractId;

    public String getDueId() {
        return dueId;
    }

    public void setDueId(String dueId) {
        this.dueId = dueId == null ? null : dueId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDueCode() {
        return dueCode;
    }

    public void setDueCode(String dueCode) {
        this.dueCode = dueCode == null ? null : dueCode.trim();
    }

    public String getDueType() {
        return dueType;
    }

    public void setDueType(String dueType) {
        this.dueType = dueType == null ? null : dueType.trim();
    }

    public String getDueReport() {
        return dueReport;
    }

    public void setDueReport(String dueReport) {
        this.dueReport = dueReport == null ? null : dueReport.trim();
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }
}