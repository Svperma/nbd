package com.dsib.modules.app.entity;

import java.util.Date;

public class GgFinancial {
    private String id;

    private String userId;

    private String chartType;

    private String chartYear;

    private String chartMonth;

    private String chartSource;

    private Date inputTime;

    private String updator;

    private Date updateTime;

    private String remark;

    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType == null ? null : chartType.trim();
    }

    public String getChartYear() {
        return chartYear;
    }

    public void setChartYear(String chartYear) {
        this.chartYear = chartYear == null ? null : chartYear.trim();
    }

    public String getChartMonth() {
        return chartMonth;
    }

    public void setChartMonth(String chartMonth) {
        this.chartMonth = chartMonth == null ? null : chartMonth.trim();
    }

    public String getChartSource() {
        return chartSource;
    }

    public void setChartSource(String chartSource) {
        this.chartSource = chartSource == null ? null : chartSource.trim();
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