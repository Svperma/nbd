package com.dsib.modules.app.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GuPolicyMain {
    private String businessNo;

    private String proposalNo;

    private String policyNo;

    private String insuredCode;

    private String insureAppli;

    private String riskCode;

    private BigDecimal amount;

    private BigDecimal premium;

    private BigDecimal rate;

    private BigDecimal excess;

    private Date startDate;

    private Date endDate;

    private String insuranceCode;

    private String disputeType;

    private String arbitrationCommision;

    private String status;

    private String letterId;

    private String contractId;

    private String insurancePath;

    private String broker;

    private String beneficiary;

    private Date inputTime;

    private String recordAddress;

    private String updator;

    private Date updateTime;

    private String remark;

    private String flag;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    public String getProposalNo() {
        return proposalNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo == null ? null : proposalNo.trim();
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo == null ? null : policyNo.trim();
    }

    public String getInsuredCode() {
        return insuredCode;
    }

    public void setInsuredCode(String insuredCode) {
        this.insuredCode = insuredCode == null ? null : insuredCode.trim();
    }

    public String getInsureAppli() {
        return insureAppli;
    }

    public void setInsureAppli(String insureAppli) {
        this.insureAppli = insureAppli == null ? null : insureAppli.trim();
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode == null ? null : riskCode.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getExcess() {
        return excess;
    }

    public void setExcess(BigDecimal excess) {
        this.excess = excess;
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

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode == null ? null : insuranceCode.trim();
    }

    public String getDisputeType() {
        return disputeType;
    }

    public void setDisputeType(String disputeType) {
        this.disputeType = disputeType == null ? null : disputeType.trim();
    }

    public String getArbitrationCommision() {
        return arbitrationCommision;
    }

    public void setArbitrationCommision(String arbitrationCommision) {
        this.arbitrationCommision = arbitrationCommision == null ? null : arbitrationCommision.trim();
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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getInsurancePath() {
        return insurancePath;
    }

    public void setInsurancePath(String insurancePath) {
        this.insurancePath = insurancePath == null ? null : insurancePath.trim();
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker == null ? null : broker.trim();
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary == null ? null : beneficiary.trim();
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