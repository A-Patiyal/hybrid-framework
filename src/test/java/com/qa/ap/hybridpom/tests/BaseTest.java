package com.qa.ap.hybridpom.tests;

import java.io.File;

import com.qa.ap.hybridpom.utilities.BrowserFactory;
import com.qa.ap.hybridpom.utilities.ReadConfig;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class BaseTest
{
	 ReadConfig config;
	public static WebDriver driver;
	public Logger logger;

	@BeforeSuite
	public void setupSuite()
	{
		config = new ReadConfig();
	}
	@BeforeClass
	public void setup()
	{
		logger = LogManager.getLogger("Test_Framework");
		driver = BrowserFactory.startApplication(driver,config.getBrowser(), config.getApplicationUrl());
	}


	public void captureScreen(WebDriver driver, String tname) throws Exception
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/ScreenShots/" +tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}

	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}
