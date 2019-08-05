package com.briteERP.pages;

import com.briteERP.utilities.BasePage;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//   Project Name: FinalBriteERPTestNG
//   Date:8/5/2019
//   Created by: Esra Akbulut

public class CRMPage extends BasePage {
    @FindBy(xpath = "//div[@class='o_kanban_group ui-sortable o_kanban_has_progressbar']/div[3]//strong[@class='o_kanban_record_title']")
    public WebElement secondRowItemName;

    @FindBy(xpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr")
    public WebElement tableRows;





//    @FindBy(xpath= "//button[@class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list active']")
//    public WebElement listView;

    public void selectGridSetting(String gridSettingsElement) {
        //click on grid options
       // waitUntilLoaderScreenDisappear();

        //create locator for grid option based on the name
        String locatorforGridOption="//button[@data-original-title='"+gridSettingsElement+"']";
        WebElement gridOption = Driver.getDriver().findElement(By.xpath(locatorforGridOption));
        gridOption.click();

    }

    public void findMyValue(String value){

    }


}
