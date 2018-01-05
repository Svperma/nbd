package com.dsib.modules.business.cm.web.controller.moduleController;

import com.dsib.common.utils.R;
import com.dsib.modules.business.cm.model.module.Module;
import com.dsib.modules.business.cm.model.module.ModuleExample;
import com.dsib.modules.business.cm.model.module.ModuleKey;
import com.dsib.modules.business.cm.model.module.bo.ModuleDvol;
import com.dsib.modules.business.cm.model.module.bo.ModuleQueryBo;
import com.dsib.modules.business.cm.service.moduleService.IModuleService;
import com.dsib.modules.sys.controller.AbstractController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * Created by guanwangwei on 2017/10/12.
 */
@RestController
@RequestMapping("/module")
public class ModuleAsynController extends AbstractController {
    @Autowired
    private IModuleService moduleService;


    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:module:add")
    public R insertBugLevel(Module record) {
        int dataCode = moduleService.insert(record);
        return R.ok();
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @RequestMapping("/update")
    public R updateBugLevel(Module record,ModuleKey key) {
        BeanUtils.copyProperties(key, record);
        moduleService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @RequestMapping("/delete")
    public R deleteBugLevel(ModuleKey key) {
        moduleService.deleteByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 查看单个实体
     * @param key
     * @return
     */
    @RequestMapping("/getModuleInfo")
    public R getPageInfo( ModuleKey key) {
        moduleService.selectByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 分页查询
     * @param queryBo
     * @return
     */
    @RequestMapping("/modulePageInfo")
    public R getPageInfo(ModuleQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        ModuleExample example = new ModuleExample();
        ModuleExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getModuleName())){
            criteria.andModuleNameLike("%"+queryBo.getModuleName()+"%");
        }
        if (StringUtils.isNotBlank(queryBo.getProjectId())){
            criteria.andProjectIdEqualTo(queryBo.getProjectId());
        }
        List<ModuleDvol> list = this.moduleService.selectModuleList(example);
        PageInfo pageInfo =  new PageInfo<ModuleDvol>(list);
        return R.ok().put("page",pageInfo);
    }
}
