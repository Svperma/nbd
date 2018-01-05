package com.dsib.modules.app.entity;

public class GgAuditRecordKey {
    private String auditId;

    private Integer seriesNo;

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    public Integer getSeriesNo() {
        return seriesNo;
    }

    public void setSeriesNo(Integer seriesNo) {
        this.seriesNo = seriesNo;
    }
}