package com.dsib.modules.app.entity;

public class GuDueDetailKey {
    private String dueId;

    private String dueType;

    private String subjectType;

    private String id;

    public String getDueId() {
        return dueId;
    }

    public void setDueId(String dueId) {
        this.dueId = dueId == null ? null : dueId.trim();
    }

    public String getDueType() {
        return dueType;
    }

    public void setDueType(String dueType) {
        this.dueType = dueType == null ? null : dueType.trim();
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType == null ? null : subjectType.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}