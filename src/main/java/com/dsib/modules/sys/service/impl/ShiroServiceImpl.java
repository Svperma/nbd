package com.dsib.modules.sys.service.impl;

import com.dsib.common.utils.Constant;
import com.dsib.modules.sys.dao.SysMenuDao;
import com.dsib.modules.sys.dao.SysRoleDao;
import com.dsib.modules.sys.dao.SysUserDao;
import com.dsib.modules.sys.dao.SysUserTokenDao;
import com.dsib.modules.sys.entity.SysMenuEntity;
import com.dsib.modules.sys.entity.SysUserEntity;
import com.dsib.modules.sys.entity.SysUserTokenEntity;
import com.dsib.modules.sys.service.ShiroService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ShiroServiceImpl implements ShiroService {
    @Autowired
    private SysMenuDao sysMenuDao;
    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysRoleDao sysRoleDao;
    @Autowired
    private SysUserTokenDao sysUserTokenDao;

    @Override
    public Set<String> getUserPermissions(long userId) {
        List<String> permsList;

        //系统管理员，拥有最高权限
        if (userId == Constant.SUPER_ADMIN) {
            List<SysMenuEntity> menuList = sysMenuDao.queryList(new HashMap<>());
            permsList = new ArrayList<>(menuList.size());
            for (SysMenuEntity menu : menuList) {
                permsList.add(menu.getPerms());
            }
        } else {
            permsList = sysUserDao.queryAllPerms(userId);
        }
        //用户权限列表
        Set<String> permsSet = new HashSet<>();
        for (String perms : permsList) {
            if (StringUtils.isBlank(perms)) {
                continue;
            }
            permsSet.addAll(Arrays.asList(perms.trim().split(",")));
        }
        return permsSet;
    }

    @Override
    public SysUserTokenEntity queryByToken(String token) {
        SysUserTokenEntity sysUserTokenEntity = sysUserTokenDao.queryByToken(token);
        return sysUserTokenEntity;
    }

    @Override
    public SysUserEntity queryUser(Long userId) {
        SysUserEntity sysUserEntity = sysUserDao.queryObject(userId);
        sysUserEntity.setRoleIdList(sysRoleDao.queryRoleIdList(userId));
        return sysUserEntity;
    }
}
