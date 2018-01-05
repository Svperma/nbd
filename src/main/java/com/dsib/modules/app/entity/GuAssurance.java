package com.dsib.modules.app.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GuAssurance {
    private String assureId;

    private String assureContractNo;

    private String assureCompany;

    private String userId;

    private String productId;

    private BigDecimal assureAmount;

    private BigDecimal assurePremium;

    private Date startDate;

    private Date endDate;

    private String status;

    private String letterId;

    private String loanContractNo;

    private BigDecimal financeAmount;

    private String financeArrange;

    private String financeBank;

    private Date inputTime;

    private String recordAddress;

    private String updator;

    private Date updateTime;

    private String remark;

    private String flag;

    public String getAssureId() {
        return assureId;
    }

    public void setAssureId(String assureId) {
        this.assureId = assureId == null ? null : assureId.trim();
    }

    public String getAssureContractNo() {
        return assureContractNo;
    }

    public void setAssureContractNo(String assureContractNo) {
        this.assureContractNo = assureContractNo == null ? null : assureContractNo.trim();
    }

    public String getAssureCompany() {
        return assureCompany;
    }

    public void setAssureCompany(String assureCompany) {
        this.assureCompany = assureCompany == null ? null : assureCompany.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getAssureAmount() {
        return assureAmount;
    }

    public void setAssureAmount(BigDecimal assureAmount) {
        this.assureAmount = assureAmount;
    }

    public BigDecimal getAssurePremium() {
        return assurePremium;
    }

    public void setAssurePremium(BigDecimal assurePremium) {
        this.assurePremium = assurePremium;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getLetterId() {
        return letterId;
    }

    public void setLetterId(String letterId) {
        this.letterId = letterId == null ? null : letterId.trim();
    }

    public String getLoanContractNo() {
        return loanContractNo;
    }

    public void setLoanContractNo(String loanContractNo) {
        this.loanContractNo = loanContractNo == null ? null : loanContractNo.trim();
    }

    public BigDecimal getFinanceAmount() {
        return financeAmount;
    }

    public void setFinanceAmount(BigDecimal financeAmount) {
        this.financeAmount = financeAmount;
    }

    public String getFinanceArrange() {
        return financeArrange;
    }

    public void setFinanceArrange(String financeArrange) {
        this.financeArrange = financeArrange == null ? null : financeArrange.trim();
    }

    public String getFinanceBank() {
        return financeBank;
    }

    public void setFinanceBank(String financeBank) {
        this.financeBank = financeBank == null ? null : financeBank.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getRecordAddress() {
        return recordAddress;
    }

    public void setRecordAddress(String recordAddress) {
        this.recordAddress = recordAddress == null ? null : recordAddress.trim();
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