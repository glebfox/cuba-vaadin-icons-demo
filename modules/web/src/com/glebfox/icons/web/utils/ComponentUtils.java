package com.glebfox.icons.web.utils;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.theme.ThemeConstantsManager;

/**
 * @author glebfox
 */
public class ComponentUtils {

    private static final ThemeConstantsManager themeCM = AppBeans.get(ThemeConstantsManager.NAME);

    public static void setIconFromThemeConstant(Component.HasIcon component, String constantName) {
        String icon = themeCM.getThemeValue(constantName);
        component.setIcon(icon);
    }

    public static void setIconFromThemeConstant(Action action, String constantName) {
        String icon = themeCM.getThemeValue(constantName);
        action.setIcon(icon);
    }
}
