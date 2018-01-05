package com.dsib.modules.app.entity;

public class GuPayNoticeKey {
    private String applyId;

    private String notifierType;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getNotifierType() {
        return notifierType;
    }

    public void setNotifierType(String notifierType) {
        this.notifierType = notifierType == null ? null : notifierType.trim();
    }
}