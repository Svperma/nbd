package com.dsib.modules.app.entity;

import java.math.BigDecimal;

public class GgProductDetail {
    private String productId;

    private String loanAmount;

    private String loanArrange;

    private BigDecimal rate;

    private String payType;

    private String productImg;

    private String productDes;

    private String productIntroduce;

    private String infomation;

    private String flag;

    private String remark;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount == null ? null : loanAmount.trim();
    }

    public String getLoanArrange() {
        return loanArrange;
    }

    public void setLoanArrange(String loanArrange) {
        this.loanArrange = loanArrange == null ? null : loanArrange.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes == null ? null : productDes.trim();
    }

    public String getProductIntroduce() {
        return productIntroduce;
    }

    public void setProductIntroduce(String productIntroduce) {
        this.productIntroduce = productIntroduce == null ? null : productIntroduce.trim();
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation == null ? null : infomation.trim();
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