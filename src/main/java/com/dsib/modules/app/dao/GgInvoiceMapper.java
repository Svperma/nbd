package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgInvoice;

public interface GgInvoiceMapper {
    int deleteByPrimaryKey(String contractId);

    int insert(GgInvoice record);

    int insertSelective(GgInvoice record);

    GgInvoice selectByPrimaryKey(String contractId);

    int updateByPrimaryKeySelective(GgInvoice record);

    int updateByPrimaryKey(GgInvoice record);
}