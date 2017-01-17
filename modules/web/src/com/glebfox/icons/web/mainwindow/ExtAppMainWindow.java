package com.glebfox.icons.web.mainwindow;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.gui.components.mainwindow.LogoutButton;
import com.haulmont.cuba.gui.components.mainwindow.NewWindowButton;
import com.haulmont.cuba.gui.theme.ThemeConstantsManager;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private LogoutButton logoutButton;
    @Inject
    private NewWindowButton newWindowButton;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        initLogoutButton();

        initNewWindowButton();
    }

    private void initLogoutButton() {
        ThemeConstantsManager thCM = AppBeans.get(ThemeConstantsManager.NAME);
        String icon = thCM.getThemeValue("mainwindow.buttons.LogoutButton.icon");
        logoutButton.setIcon(icon);
    }

    private void initNewWindowButton() {
        ThemeConstantsManager thCM = AppBeans.get(ThemeConstantsManager.NAME);
        String icon = thCM.getThemeValue("mainwindow.buttons.NewWindowButton.icon");
        newWindowButton.setIcon(icon);
    }
}
