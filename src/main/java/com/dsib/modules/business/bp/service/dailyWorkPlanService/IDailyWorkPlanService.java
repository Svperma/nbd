package com.dsib.modules.business.bp.service.dailyWorkPlanService;

import com.dsib.common.services.IBaseService;
import com.dsib.modules.business.bp.model.dailyWorkPlan.bo.CmDailyWorkPlanQueryBo;

import java.util.List;

public interface IDailyWorkPlanService<DailyWorkPlanKey, DailyWorkPlan, DailyWorkPlanExample> extends IBaseService<DailyWorkPlanKey, DailyWorkPlan, DailyWorkPlanExample> {
    int insertOrtherTest(DailyWorkPlan record);
    List<DailyWorkPlan> getDailyWorkPlanList(CmDailyWorkPlanQueryBo queryBo);
}
