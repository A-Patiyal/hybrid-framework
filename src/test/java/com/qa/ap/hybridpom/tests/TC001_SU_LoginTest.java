package com.qa.ap.hybridpom.tests;

import com.qa.ap.hybridpom.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_SU_LoginTest extends BaseTest
{
    @Test
    public void loginTest()
    {
        logger.info("Starting Test");
        LoginPage lp = new LoginPage(driver);
        lp.standardUserLogin(config.getStandardUsername(), config.getStandardUserPassword());
        String actualPage = driver.getCurrentUrl();
        String expPage = "https://www.saucedemo.com/v1/inventory.html";
        logger.info("Validating");
        Assert.assertEquals(actualPage,expPage, "Validation");
        logger.info("Test Pass");
    }
}
