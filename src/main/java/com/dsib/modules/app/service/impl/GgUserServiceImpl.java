package com.dsib.modules.app.service.impl;

import com.dsib.modules.app.dao.GgUserMapper;
import com.dsib.modules.app.entity.GgUser;
import com.dsib.modules.app.service.GgUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ggUserService")
public class GgUserServiceImpl implements GgUserService {
    @Autowired
    private GgUserMapper ggUserMapper;

    int n = 0;
    @Override
    public int deleteByPrimaryKey(String userId) {
        n = ggUserMapper.deleteByPrimaryKey(userId);
        return n;
    }

    @Override
    public int insert(GgUser record) {
        record.setPassword(DigestUtils.sha256Hex(record.getPassword()));
        n = ggUserMapper.insert(record);
        return n;
    }

    @Override
    public int insertSelective(GgUser record) {
        record.setPassword(DigestUtils.sha256Hex(record.getPassword()));
        n = ggUserMapper.insertSelective(record);
        return n;
    }

    @Override
    public GgUser selectByPrimaryKey(String userId) {
        GgUser ggUser = ggUserMapper.selectByPrimaryKey(userId);
        return ggUser;
    }

    @Override
    public int updateByPrimaryKeySelective(GgUser record) {
        n = ggUserMapper.updateByPrimaryKeySelective(record);
        return n;
    }

    @Override
    public int updateByPrimaryKey(GgUser record) {
        n = ggUserMapper.updateByPrimaryKey(record);
        return n;
    }
}
