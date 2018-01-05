package com.dsib.modules.business.cm.model.difficultLevel.bo;

import com.dsib.common.bo.BaseQueryBo;

public class DifficultLevelQueryBo extends BaseQueryBo {

    private  String difficultyLevelName;

    public String getDifficultyLevelName() {
        return difficultyLevelName;
    }

    public void setDifficultyLevelName(String difficultyLevelName) {
        this.difficultyLevelName = difficultyLevelName;
    }
}
