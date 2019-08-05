package com.briteERP.pages;

import com.briteERP.utilities.BasePage;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//   Project Name: FinalBriteERPTestNG
//   Date:8/5/2019
//   Created by: Esra Akbulut
public class LoginPage {

    public LoginPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "login")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(name = "password")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    @CacheLookup
    WebElement loginButtonElement;

    @FindBy(xpath = "p[@class='alert alert-danger']")
    public WebElement errorMessageElement;


    public void login(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }


    public String getErrorMessage(){
        return errorMessageElement.getText();
    }
}
