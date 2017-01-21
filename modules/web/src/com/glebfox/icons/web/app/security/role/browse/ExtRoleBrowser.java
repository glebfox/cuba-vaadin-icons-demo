package com.glebfox.icons.web.app.security.role.browse;

import com.glebfox.icons.web.utils.ComponentUtils;
import com.haulmont.cuba.gui.app.security.role.browse.RoleBrowser;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.theme.ThemeConstantsManager;

import javax.inject.Inject;

public class ExtRoleBrowser extends RoleBrowser {
    @Inject
    private ThemeConstantsManager themeCM;

    @Override
    public void ready() {
        super.ready();

        initAssignToUsersAction();
        initExportAction();
        initImportRolesUpload();
    }

    private void initAssignToUsersAction() {
        Action action = rolesTable.getAction("assignToUsers");
        ComponentUtils.setIconFromThemeConstant(action, "role.browse.actions.AssignToUsers.icon");
    }

    private void initExportAction() {
        Action action = rolesTable.getAction("export");
        ComponentUtils.setIconFromThemeConstant(action, "role.browse.actions.Export.icon");
    }

    private void initImportRolesUpload() {
        String icon = themeCM.getThemeValue("role.browse.buttons.Import.icon");
        importRolesUpload.setUploadButtonIcon(icon);
    }
}
