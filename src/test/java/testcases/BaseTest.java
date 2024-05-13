package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.BrowserFactory;
import utilities.ReadConfig;

public class BaseTest 
{
	public WebDriver driver;
	public ReadConfig config=new ReadConfig();
	
	@BeforeClass
	public void setup()
	{
		driver = BrowserFactory.startApplication(driver, config.setBrowser(), config.setQAURL());
	}
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
}
