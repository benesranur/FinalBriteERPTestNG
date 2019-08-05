package com.briteERP.tests;

//   Project Name: FinalBriteERPTestNG
//   Date:8/5/2019
//   Created by: Esra Akbulut

import com.briteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class CRMTests extends TestBase {
    @Test
    public void verifyGridAndPivotHasTheSameValue(){
        extentLogger = report.createTest("verifying Grid And Pivot Has The Same Value");
        pages.loginPage().login();
        pages.crmPage().navigateToModule("CRM");
        pages.crmPage().waitUntilLoaderScreenDisappear();
        String gridValue=pages.crmPage().secondRowItemName.getText();
        //pages.crmPage().selectGridSetting("List");




    }
}
