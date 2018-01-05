package com.dsib.modules.app.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GuApplyCertificate {
    private String certId;

    private String userId;

    private BigDecimal lastMonthAsset;

    private BigDecimal lastMonthDebt;

    private BigDecimal lastYearIncome;

    private BigDecimal lastYearRevenue;

    private BigDecimal lastYearProfit;

    private String creditLevel;

    private String loanInfo;

    private String certStatus;

    private Date inputTime;

    private String updator;

    private Date updateTime;

    private String flag;

    private String remark;

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId == null ? null : certId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getLastMonthAsset() {
        return lastMonthAsset;
    }

    public void setLastMonthAsset(BigDecimal lastMonthAsset) {
        this.lastMonthAsset = lastMonthAsset;
    }

    public BigDecimal getLastMonthDebt() {
        return lastMonthDebt;
    }

    public void setLastMonthDebt(BigDecimal lastMonthDebt) {
        this.lastMonthDebt = lastMonthDebt;
    }

    public BigDecimal getLastYearIncome() {
        return lastYearIncome;
    }

    public void setLastYearIncome(BigDecimal lastYearIncome) {
        this.lastYearIncome = lastYearIncome;
    }

    public BigDecimal getLastYearRevenue() {
        return lastYearRevenue;
    }

    public void setLastYearRevenue(BigDecimal lastYearRevenue) {
        this.lastYearRevenue = lastYearRevenue;
    }

    public BigDecimal getLastYearProfit() {
        return lastYearProfit;
    }

    public void setLastYearProfit(BigDecimal lastYearProfit) {
        this.lastYearProfit = lastYearProfit;
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel == null ? null : creditLevel.trim();
    }

    public String getLoanInfo() {
        return loanInfo;
    }

    public void setLoanInfo(String loanInfo) {
        this.loanInfo = loanInfo == null ? null : loanInfo.trim();
    }

    public String getCertStatus() {
        return certStatus;
    }

    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus == null ? null : certStatus.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}