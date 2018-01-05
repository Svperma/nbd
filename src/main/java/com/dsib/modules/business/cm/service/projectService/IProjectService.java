package com.dsib.modules.business.cm.service.projectService;

import com.dsib.common.services.IBaseService;

public interface IProjectService<ProjectKey, Project, ProjectExample> extends IBaseService<ProjectKey, Project, ProjectExample> {
    int insertOrtherTest(Project record);
}
