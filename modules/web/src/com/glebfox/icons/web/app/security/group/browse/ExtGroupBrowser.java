package com.glebfox.icons.web.app.security.group.browse;

import com.glebfox.icons.web.utils.ComponentUtils;
import com.haulmont.cuba.gui.app.security.group.browse.GroupBrowser;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.theme.ThemeConstantsManager;

import javax.inject.Inject;

public class ExtGroupBrowser extends GroupBrowser {

    @Inject
    private ThemeConstantsManager themeCM;

    @Override
    public void ready() {
        super.ready();

        initExportAction();
        initImportUpload();
    }

    private void initExportAction() {
        Action action = groupsTree.getAction("export");
        ComponentUtils.setIconFromThemeConstant(action, "group.browse.actions.Export.icon");
    }

    private void initImportUpload() {
        String icon = themeCM.getThemeValue("group.browse.buttons.Import.icon");
        importUpload.setUploadButtonIcon(icon);
    }
}
