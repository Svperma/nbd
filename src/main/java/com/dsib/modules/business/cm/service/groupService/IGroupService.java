package com.dsib.modules.business.cm.service.groupService;

import com.dsib.common.services.IBaseService;
import com.dsib.modules.business.cm.model.group.bo.GroupDvol;

import java.util.List;

public interface IGroupService<GroupKey, Group, GroupExample> extends IBaseService<GroupKey, Group, GroupExample> {
    int insertOrtherTest(Group record);

    List<GroupDvol> selectGroupList(GroupExample example);
}
