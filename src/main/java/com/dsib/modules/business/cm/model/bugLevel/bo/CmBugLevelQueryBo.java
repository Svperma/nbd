package com.dsib.modules.business.cm.model.bugLevel.bo;


import com.dsib.common.bo.BaseQueryBo;

/**
 * Created by joslyn on 2017/9/14.
 */
public class CmBugLevelQueryBo extends BaseQueryBo {

    private String bugLevelName;

    public String getBugLevelName() {
        return bugLevelName;
    }

    public void setBugLevelName(String bugLevelName) {
        this.bugLevelName = bugLevelName;
    }
}
