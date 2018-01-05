package com.dsib.modules.business.cm.dao.crud.projectMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.project.Project;
import com.dsib.modules.business.cm.model.project.ProjectExample;
import com.dsib.modules.business.cm.model.project.ProjectKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(ProjectKey key);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(ProjectKey key);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}