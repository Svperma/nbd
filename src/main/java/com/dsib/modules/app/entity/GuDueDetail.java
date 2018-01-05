package com.dsib.modules.app.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GuDueDetail extends GuDueDetailKey {
    private Date creditTime;

    private Integer finishNum;

    private Integer loanNum;

    private BigDecimal loanAmount;

    private BigDecimal illegalAmount;

    private Integer overdueNum;

    private Integer months;

    private Integer maxDueMonths;

    private BigDecimal maxAmountPerMonth;

    private String dueCode;

    private String flag;

    private String remark;

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Integer getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Integer finishNum) {
        this.finishNum = finishNum;
    }

    public Integer getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(Integer loanNum) {
        this.loanNum = loanNum;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getIllegalAmount() {
        return illegalAmount;
    }

    public void setIllegalAmount(BigDecimal illegalAmount) {
        this.illegalAmount = illegalAmount;
    }

    public Integer getOverdueNum() {
        return overdueNum;
    }

    public void setOverdueNum(Integer overdueNum) {
        this.overdueNum = overdueNum;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Integer getMaxDueMonths() {
        return maxDueMonths;
    }

    public void setMaxDueMonths(Integer maxDueMonths) {
        this.maxDueMonths = maxDueMonths;
    }

    public BigDecimal getMaxAmountPerMonth() {
        return maxAmountPerMonth;
    }

    public void setMaxAmountPerMonth(BigDecimal maxAmountPerMonth) {
        this.maxAmountPerMonth = maxAmountPerMonth;
    }

    public String getDueCode() {
        return dueCode;
    }

    public void setDueCode(String dueCode) {
        this.dueCode = dueCode == null ? null : dueCode.trim();
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