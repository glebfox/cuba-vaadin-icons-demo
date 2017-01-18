package com.glebfox.icons.web.app.security.user.browse;

import com.glebfox.icons.web.utils.ComponentUtils;
import com.haulmont.cuba.gui.app.security.user.browse.UserBrowser;

import java.util.Map;

public class ExtUserBrowser extends UserBrowser {

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        initCopyAction();
        initAdditionalActionsButton();
    }

    private void initCopyAction() {
        ComponentUtils.setIconFromThemeConstant(copyAction, "user.browse.actions.Copy.icon");
    }

    private void initAdditionalActionsButton() {
        ComponentUtils.setIconFromThemeConstant(additionalActionsBtn, "user.browse.buttons.AdditionalActions.icon");
    }
}
