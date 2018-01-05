package com.dsib.modules.app.controller;

import com.dsib.common.utils.R;
import com.dsib.common.validator.Assert;
import com.dsib.modules.app.entity.GgUser;
import com.dsib.modules.app.service.GgUserService;
import com.dsib.modules.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册
 * @author seits
 * @email *.com
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/app")
public class ApiRegisterController {
    @Autowired
    private UserService userService;
    @Autowired
    private GgUserService ggUserService;

    /**
     * 注册
     */
    @PostMapping("register")
    public R register(GgUser ggUser){
        Assert.isBlank(ggUser.getUserId(), "用户代码不能为空");
        Assert.isBlank(ggUser.getPassword(), "密码不能为空");
        Assert.isBlank(ggUser.getUserId(), "用户类型不能为空");
        Assert.isBlank(ggUser.getRole(), "用户角色不能为空");

        //userService.save(mobile, password);
        ggUserService.insertSelective(ggUser);

        return R.ok();
    }
}
