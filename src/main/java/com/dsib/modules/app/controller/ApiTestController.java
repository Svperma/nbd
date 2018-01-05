package com.dsib.modules.app.controller;

import com.dsib.common.annotation.SysLog;
import com.dsib.common.utils.R;
import com.dsib.modules.app.annotation.Login;
import com.dsib.modules.app.annotation.LoginUser;
import com.dsib.modules.app.entity.UserEntity;
import com.dsib.modules.app.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * APP测试接口
 *
 * @author seits
 * @email *.com
 * @date 2017-03-23 15:47
 */
@RestController
@RequestMapping("/app")
public class ApiTestController {

    @Resource(name="userService")
    private UserService userService;
    /**
     * 获取用户信息
     */
    @Login
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    /**
     * 获取用户ID
     */
    @Login
    @GetMapping("userId")
    public R userInfo(@RequestAttribute("userId") Integer userId){
        return R.ok().put("userId", userId);
    }

    /**
     * 根据id获取user
     * */
    @Login
    @GetMapping("getUserById")
    public R getUserById(@RequestAttribute("userId") long userId){
        UserEntity user = userService.queryObject(userId);
        return R.ok().put("user",user);
    }

    /**
     * 忽略Token验证测试
     */
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

}
