package com.dsib.modules.business.cm.model.module.bo;

import com.dsib.common.bo.BaseQueryBo;

public class ModuleQueryBo extends BaseQueryBo {
    private String moduleName;
    private String projectName;
    private String projectId;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {

        return projectId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
