package TestCases;

import org.testng.annotations.Test;

import PomClasses.CartPage;
import PomClasses.HomePageAfterLogin;
import PomClasses.Women;
import utilities.BaseClass;

public class VerifyWomenModule extends BaseClass {

	
	@Test
	
	public void Tc_Women_003() {
		
		HomePageAfterLogin HPAL = new HomePageAfterLogin(driver);
		Women women = new Women(driver);
		women.getwomenKurthiAddToCartButton().click();
	
	HPAL.getMainCartIcon().click();
	
	CartPage CartPom = new CartPage(driver);
	String actualResult = CartPom.getRayYonSleeveLength().getText();
	
	if(actualResult.contains("Fabric : Rayon")) {
		System.out.println("test case pass");
	}
	else
	{
		System.out.println("test case fail");

	}
	}
}
