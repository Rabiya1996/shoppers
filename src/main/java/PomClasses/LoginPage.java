package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	public WebElement getPassTextField() {
		return PassTextField;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}

	
	//declaration
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Email")
	private WebElement PassTextField;
	
	@FindBy(id="Email")
	private WebElement LoginButton;
	
	
	
	
}
