package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;

public class AppLoginTest extends BaseTest
{
	@Test
	public void loginApp() {
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(config.setUserName(), config.setPassword());
	}
}
