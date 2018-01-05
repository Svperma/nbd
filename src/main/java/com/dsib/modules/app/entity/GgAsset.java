package com.dsib.modules.app.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GgAsset {
    private String assetId;

    private String userId;

    private String assetType;

    private String assetHolder;

    private String assetNature;

    private String province;

    private String city;

    private String county;

    private String town;

    private String village;

    private String address;

    private String linkType;

    private BigDecimal area;

    private BigDecimal futurePrice;

    private BigDecimal mortgageAmount;

    private BigDecimal netWorth;

    private String mortgageBank;

    private String assetImg;

    private Date inputTime;

    private String updator;

    private Date updateTime;

    private String validStatus;

    private String remark;

    private String flag;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId == null ? null : assetId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType == null ? null : assetType.trim();
    }

    public String getAssetHolder() {
        return assetHolder;
    }

    public void setAssetHolder(String assetHolder) {
        this.assetHolder = assetHolder == null ? null : assetHolder.trim();
    }

    public String getAssetNature() {
        return assetNature;
    }

    public void setAssetNature(String assetNature) {
        this.assetNature = assetNature == null ? null : assetNature.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType == null ? null : linkType.trim();
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getFuturePrice() {
        return futurePrice;
    }

    public void setFuturePrice(BigDecimal futurePrice) {
        this.futurePrice = futurePrice;
    }

    public BigDecimal getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(BigDecimal mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    public BigDecimal getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    public String getMortgageBank() {
        return mortgageBank;
    }

    public void setMortgageBank(String mortgageBank) {
        this.mortgageBank = mortgageBank == null ? null : mortgageBank.trim();
    }

    public String getAssetImg() {
        return assetImg;
    }

    public void setAssetImg(String assetImg) {
        this.assetImg = assetImg == null ? null : assetImg.trim();
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

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
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