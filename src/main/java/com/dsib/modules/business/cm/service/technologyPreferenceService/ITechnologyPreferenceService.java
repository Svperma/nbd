package com.dsib.modules.business.cm.service.technologyPreferenceService;

import com.dsib.common.services.IBaseService;

public interface ITechnologyPreferenceService<TechnologyPreferenceKey, TechnologyPreference, TechnologyPreferenceExample>
        extends IBaseService<TechnologyPreferenceKey, TechnologyPreference, TechnologyPreferenceExample> {

       int insertOrtherTest(TechnologyPreference record);
}
