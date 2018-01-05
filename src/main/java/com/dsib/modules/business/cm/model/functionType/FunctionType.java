package com.dsib.modules.business.cm.model.functionType;

import java.util.Date;

public class FunctionType extends FunctionTypeKey {
    /**
     * 功能类型名称
     */
    private String functionTypeName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取功能类型名称
     */
    public String getFunctionTypeName() {
        return functionTypeName;
    }

    /**
     * 设置功能类型名称
     */
    public void setFunctionTypeName(String functionTypeName) {
        this.functionTypeName = functionTypeName == null ? null : functionTypeName.trim();
    }

    /**
     * 获取创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}