package com.dsib.modules.business.cm.model.project.bo;

import com.dsib.common.bo.BaseQueryBo;

public class ProjectQueryBo extends BaseQueryBo {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
