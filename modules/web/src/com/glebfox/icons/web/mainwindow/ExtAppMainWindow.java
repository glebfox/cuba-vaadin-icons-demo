package com.glebfox.icons.web.mainwindow;

import com.glebfox.icons.web.utils.ComponentUtils;
import com.haulmont.cuba.gui.components.mainwindow.LogoutButton;
import com.haulmont.cuba.gui.components.mainwindow.NewWindowButton;
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
        ComponentUtils.setIconFromThemeConstant(logoutButton, "mainwindow.buttons.LogoutButton.icon");
    }

    private void initNewWindowButton() {
        ComponentUtils.setIconFromThemeConstant(newWindowButton, "mainwindow.buttons.NewWindowButton.icon");
    }
}
