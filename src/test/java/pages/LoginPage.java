package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="user-name") WebElement uName;
	@FindBy(id="password") WebElement pwd;	
	@FindBy(id="login-button") WebElement loginBtn;
	
	public void loginToApplication(String username, String password)
	{
		uName.sendKeys(username);
		pwd.sendKeys(password);
		loginBtn.click();
	}
}
