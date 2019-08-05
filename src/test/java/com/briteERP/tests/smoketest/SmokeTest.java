package com.briteERP.tests.smoketest;

import com.briteERP.utilities.BasePage;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {

    @Test(groups= {"Smoke"})
    public void verifyCRM() {
        extentLogger = report.createTest("Verify CRM module");
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        pages.loginPage().login();
        pages.crmPage().navigateToModule("CRM");
        pages.crmPage().waitUntilLoaderScreenDisappear();
        Assert.assertEquals(pages.crmPage().getPageSubTitle(), "Pipeline");
        extentLogger.pass("Verified that CRM page opens");

    }


}
