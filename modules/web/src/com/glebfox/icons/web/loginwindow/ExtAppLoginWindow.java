package com.glebfox.icons.web.loginwindow;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.theme.ThemeConstantsManager;
import com.haulmont.cuba.web.app.loginwindow.AppLoginWindow;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppLoginWindow extends AppLoginWindow {
    @Inject
    private Action submit;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        initSubmitAction();
    }

    private void initSubmitAction() {
        ThemeConstantsManager thCM = AppBeans.get(ThemeConstantsManager.NAME);
        String icon = thCM.getThemeValue("loginwindow.actions.Submit.icon");
        submit.setIcon(icon);
    }
}
