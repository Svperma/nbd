package com.dsib.modules.app.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GgCredit {
    private String creditId;

    private String beCrediter;

    private String creditLevel;

    private String crediter;

    private Date startDate;

    private Date endDate;

    private BigDecimal creditAmount;

    private String creditFile;

    private Date inputTime;

    private String remark;

    private String flag;

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId == null ? null : creditId.trim();
    }

    public String getBeCrediter() {
        return beCrediter;
    }

    public void setBeCrediter(String beCrediter) {
        this.beCrediter = beCrediter == null ? null : beCrediter.trim();
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel == null ? null : creditLevel.trim();
    }

    public String getCrediter() {
        return crediter;
    }

    public void setCrediter(String crediter) {
        this.crediter = crediter == null ? null : crediter.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditFile() {
        return creditFile;
    }

    public void setCreditFile(String creditFile) {
        this.creditFile = creditFile == null ? null : creditFile.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
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
}