package com.dsib.modules.business.bp.web.controller.overtimeRecordAsynController;

import com.dsib.common.utils.R;
import com.dsib.modules.business.bp.model.overtimeRecord.OvertimeRecord;
import com.dsib.modules.business.bp.model.overtimeRecord.OvertimeRecordExample;
import com.dsib.modules.business.bp.model.overtimeRecord.OvertimeRecordKey;
import com.dsib.modules.business.bp.model.overtimeRecord.bo.OvertimeRecordDvol;
import com.dsib.modules.business.bp.model.overtimeRecord.bo.OvertimeRecordQueryBo;
import com.dsib.modules.business.bp.service.overtimeRecordService.IOvertimeRecordService;
import com.dsib.modules.sys.controller.AbstractController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guanwangwei on 2017/10/12.
 */
@RestController
@RequestMapping("/overtimeRecord")
public class OvertimeRecordAsynController extends AbstractController {
    @Autowired
    private IOvertimeRecordService overtimeRecordService;

    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:workPlan:add")
    public R insertOvertimeRecord(OvertimeRecord record) {
        int dataCode = overtimeRecordService.insert(record);
        return R.ok();
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @RequestMapping("/update")
    public R updateOvertimeRecord(OvertimeRecord record,OvertimeRecordKey key) {
        BeanUtils.copyProperties(key, record);
        overtimeRecordService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @RequestMapping("/delete")
    public R deleteOvertimeRecord(OvertimeRecordKey key) {
        overtimeRecordService.deleteByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 查看单个实体
     * @param key
     * @return
     */
    @RequestMapping("/getOvertimeRecordInfo")
    public R getOvertimeRecordInfo( OvertimeRecordKey key) {
        overtimeRecordService.selectByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 分页查询
     * @param queryBo
     * @return
     */
    @RequestMapping("/overtimeRecordPageInfo")
    public R getOvertimeRecordInfoList(OvertimeRecordQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        OvertimeRecordExample example = new OvertimeRecordExample();
        OvertimeRecordExample.Criteria criteria = example.createCriteria();
//        if (StringUtils.isNotBlank(queryBo.getWorkPlanName())){
//            criteria.andWorkPlanNameLike("%"+queryBo.getWorkPlanName()+"%");
//        }
//        if (StringUtils.isNotBlank(DateUtils.format(queryBo.getPlanEnactTimeStart(),"yyyy-MM-dd HH:mm:ss")) &&
//                StringUtils.isNotEmpty(DateUtils.format(queryBo.getPlanEnactTimeEnd(),"yyyy-MM-dd HH:mm:ss"))){
//            criteria.andPlanEnactTimeBetween(queryBo.getPlanEnactTimeStart(),
//                    queryBo.getPlanEnactTimeEnd());
//        }

        List<OvertimeRecordDvol> list = this.overtimeRecordService.selectOvertimeRecordList(example);
        PageInfo pageInfo =  new PageInfo<OvertimeRecordDvol>(list);
        return R.ok().put("page",pageInfo);
    }

}
