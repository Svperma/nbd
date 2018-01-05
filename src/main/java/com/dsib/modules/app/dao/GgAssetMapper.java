package com.dsib.modules.app.dao;

import com.dsib.modules.app.entity.GgAsset;

public interface GgAssetMapper {
    int deleteByPrimaryKey(String assetId);

    int insert(GgAsset record);

    int insertSelective(GgAsset record);

    GgAsset selectByPrimaryKey(String assetId);

    int updateByPrimaryKeySelective(GgAsset record);

    int updateByPrimaryKey(GgAsset record);
}