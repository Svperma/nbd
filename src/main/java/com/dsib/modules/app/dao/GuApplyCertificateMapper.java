package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GuApplyCertificate;

public interface GuApplyCertificateMapper {
    int deleteByPrimaryKey(String certId);

    int insert(GuApplyCertificate record);

    int insertSelective(GuApplyCertificate record);

    GuApplyCertificate selectByPrimaryKey(String certId);

    int updateByPrimaryKeySelective(GuApplyCertificate record);

    int updateByPrimaryKey(GuApplyCertificate record);
}