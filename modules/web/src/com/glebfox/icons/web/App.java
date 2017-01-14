package com.glebfox.icons.web;

import com.glebfox.icons.web.fonts.VaadinIcons;
import com.haulmont.cuba.web.DefaultApp;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;

/**
 * @author glebfox
 */
public class App extends DefaultApp {
    static {
        WebComponentsHelper.registerFontIcon("vaadin-icon", VaadinIcons.class);
    }
}
