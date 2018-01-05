package com.dsib.modules.business.cm.dao.crud.pageMapper;

import java.util.List;

import com.dsib.modules.business.cm.model.page.Page;
import com.dsib.modules.business.cm.model.page.PageExample;
import com.dsib.modules.business.cm.model.page.PageKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface PageMapper {
    int countByExample(PageExample example);

    int deleteByExample(PageExample example);

    int deleteByPrimaryKey(PageKey key);

    int insert(Page record);

    int insertSelective(Page record);

    List<Page> selectByExample(PageExample example);

    Page selectByPrimaryKey(PageKey key);

    int updateByExampleSelective(@Param("record") Page record, @Param("example") PageExample example);

    int updateByExample(@Param("record") Page record, @Param("example") PageExample example);

    int updateByPrimaryKeySelective(Page record);

    int updateByPrimaryKey(Page record);
}