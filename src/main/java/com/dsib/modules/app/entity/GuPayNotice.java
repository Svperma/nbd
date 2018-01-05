package com.dsib.modules.app.entity;

import java.util.Date;

public class GuPayNotice extends GuPayNoticeKey {
    private String benoticed;

    private String notifier;

    private String payImg;

    private Date createTime;

    private String flag;

    private String remark;

    public String getBenoticed() {
        return benoticed;
    }

    public void setBenoticed(String benoticed) {
        this.benoticed = benoticed == null ? null : benoticed.trim();
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier == null ? null : notifier.trim();
    }

    public String getPayImg() {
        return payImg;
    }

    public void setPayImg(String payImg) {
        this.payImg = payImg == null ? null : payImg.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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