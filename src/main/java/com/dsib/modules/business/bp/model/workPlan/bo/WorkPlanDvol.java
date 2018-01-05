package com.dsib.modules.business.bp.model.workPlan.bo;

import com.dsib.modules.business.bp.model.workPlan.WorkPlan;

public class WorkPlanDvol extends WorkPlan {
    private String employeeName;
    private String groupName;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {

        return groupName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

}
