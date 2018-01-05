package com.dsib.modules.business.cm.model.technologyPreference.bo;

import com.dsib.common.bo.BaseQueryBo;

public class TechnologyPreferenceQueryBo extends BaseQueryBo {
    private String technologyPreferenceName;

    public String getTechnologyPreferenceName() {
        return technologyPreferenceName;
    }

    public void setTechnologyPreferenceName(String technologyPreferenceName) {
        this.technologyPreferenceName = technologyPreferenceName;
    }
}
