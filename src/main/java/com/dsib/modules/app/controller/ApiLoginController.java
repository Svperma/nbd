package com.dsib.modules.app.controller;

import com.dsib.common.utils.R;
import com.dsib.common.validator.Assert;
import com.dsib.modules.app.entity.GgUser;
import com.dsib.modules.app.service.GgUserService;
import com.dsib.modules.app.service.UserService;
import com.dsib.modules.app.utils.JwtUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * APP登录授权
 *
 * @author seits
 * @email *.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/app")
public class ApiLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private GgUserService ggUserService;
    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 登录
     */
    @PostMapping("login")
    public R login(String userId, String password){
        Assert.isBlank(userId, "用户名不能为空");
        Assert.isBlank(password, "密码不能为空");

        //用户登录
        //long userId = userService.login(mobile, password);
        GgUser ggUser = ggUserService.selectByPrimaryKey(userId);
        if(ggUser == null){
            return R.error(500,"用户不存在");
        }else {
            String digestPwd = DigestUtils.sha256Hex(password);
            if(digestPwd.equalsIgnoreCase(ggUser.getPassword())) {

                //生成token
                String token = jwtUtils.generateToken(userId);

                Map<String, Object> map = new HashMap<>();
                map.put("token", token);
                map.put("expire", jwtUtils.getExpire());

                return R.ok(map);
            }else{
                return R.error(500,"密码错误");
            }
        }
    }

}
