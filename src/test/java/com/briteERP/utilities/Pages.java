package com.briteERP.utilities;

import com.briteERP.pages.CRMPage;
import com.briteERP.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private CRMPage crmPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CRMPage crmPage() {
        if (crmPage == null) {
            crmPage = new CRMPage();
        }
        return crmPage;
    }


}
