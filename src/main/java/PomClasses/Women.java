package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {

	public WebDriver driver;
	public Women(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//span[text()='women kurti']/parent;;div/parent;;div//button")
	private WebElement getwomenKurthiAddToCartButton;
	
	public WebElement getwomenKurthiAddToCartButton()
	{
		return getwomenKurthiAddToCartButton();
	}
}
