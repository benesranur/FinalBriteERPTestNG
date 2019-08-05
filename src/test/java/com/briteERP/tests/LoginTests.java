package com.briteERP.tests;

import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginTest() {
        extentLogger = report.createTest("Logging in with correct credentials");

        pages.loginPage().login();
        //to verify that Dashboard page opened
        //Once page name Dashboard displays, means that we are logged successfully
        pages.crmPage().waitUntilLoaderScreenDisappear();
        Assert.assertEquals(pages.crmPage().getPageSubTitle(), "#Inbox");
        extentLogger.pass("Verified page name: " + pages.crmPage().getPageSubTitle());
    }

    @Test(description = "Login with invalid credentials and verify warning message")
    public void negativeLoginTest1() {
        extentLogger = report.createTest("Negative login test");
        extentLogger.info("Login with wrongusername username and wrongpassword password");
        pages.loginPage().login("wrongusername", "wrongpassword");
        Assert.assertEquals(pages.loginPage().getErrorMessage(), "\n" +
                "                    Wrong login/password\n" +
                "                ");
        extentLogger.pass("Verified that Message present: " + pages.loginPage().getErrorMessage());
    }



}
