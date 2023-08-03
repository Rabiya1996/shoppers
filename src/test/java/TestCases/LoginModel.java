package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PomClasses.HomePageAfterLogin;
import utilities.BaseClass;

public class LoginModel extends BaseClass{
	
	
@Test(groups = {"regressiontestcase" , "Smoketestcase"})

	public void TC_Login_001() throws IOException, Throwable
	{
	HomePageAfterLogin Hmal = new HomePageAfterLogin(driver);
	Hmal.getMenMenuLink().click();
	Thread.sleep(5000);
		driver.close();

	}
	@Test(groups = {"Smoketestcase"})
	public void TC_Login_002() throws IOException, Throwable
	{
		HomePageAfterLogin Hmal = new HomePageAfterLogin(driver);
		Hmal.getWomenMenuLink().click();
		Thread.sleep(5000);
		driver.close();
}
	
	//(alwaysRun=false)
	//@Test(dependsOnGroups="A1TC_Login_003", alwaysRun=true)		
		
	//(alwaysRun=false)
		
		
		
		
		
		
		
		
		
}

















