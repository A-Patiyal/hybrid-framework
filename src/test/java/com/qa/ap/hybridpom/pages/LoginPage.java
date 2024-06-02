package com.qa.ap.hybridpom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.saucedemo.com/v1/
public class LoginPage {
   WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(id = "user-name") WebElement s_user;
    @FindBy(id = "password") WebElement s_pass;
    @FindBy(id = "login-button") WebElement loginButton;

    public void standardUserLogin(String user, String pass)
    {
        s_user.sendKeys(user);
        s_pass.sendKeys(pass);
        loginButton.click();
    }
}