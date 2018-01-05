package com.dsib.modules.business.cm.service.pageService;

import com.dsib.common.services.IBaseService;
import com.dsib.modules.business.cm.model.page.bo.PageDvol;

import java.util.List;

public interface IPageService<PageKey, Page, PageExample> extends IBaseService<PageKey, Page, PageExample> {
    int insertOrtherTest(Page record);

    List<PageDvol> selectPageList(PageExample example);
}
