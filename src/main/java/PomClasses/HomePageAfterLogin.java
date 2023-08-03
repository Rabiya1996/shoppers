package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAfterLogin {

	public WebDriver driver;
	
	public HomePageAfterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="men")
	private WebElement MenMenuLink;
	
	@FindBy(xpath="//*[name()='svg' and @data-testtide'SettingsIcon']")
	private WebElement AccountSettingIcon;
	
	@FindBy(xpath="//*[name()='svg' and @data-testtide'LogoutIcon']")
	private WebElement LogoutIcon;
	
	@FindBy(id="women")
	private WebElement WomenMenuLink;
	
	@FindBy(id="kids")
	private WebElement KidsMenuLink;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMenMenuLink() {
		return MenMenuLink;
	}

	public WebElement getAccountSettingIcon() {
		return AccountSettingIcon;
	}

	public WebElement getLogoutIcon() {
		return LogoutIcon;
	}

	public WebElement getWomenMenuLink() {
		return WomenMenuLink;
	}

	public WebElement getKidsMenuLink() {
		return KidsMenuLink;
	}

	public WebElement getElectronicsMenuLink() {
		return ElectronicsMenuLink;
	}

	public WebElement getBeautyMenuLink() {
		return beautyMenuLink;
	}

	public WebElement getMainCartIcon() {
		return MainCartIcon;
	}

	@FindBy(id="electronics")
	private WebElement ElectronicsMenuLink;
	
	@FindBy(id="beautyProducts")
	private WebElement beautyMenuLink;
	
	@FindBy(xpath="//*[name()='svg' and @id='cartIcon']")
	private WebElement MainCartIcon;
	
	

}
