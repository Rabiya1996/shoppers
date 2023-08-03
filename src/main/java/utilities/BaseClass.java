package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.HomePageAfterLogin;
import PomClasses.HomePageBeforeLogin;
import PomClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;


@org.testng.annotations.BeforeClass(groups = {"regressiontestcase" , "Smoketestcase"})
public void BeforeClass() throws Throwable{
	
	DataUtillities dataProperties = new DataUtillities();
	String BROWSER = dataProperties.dataFromPropertiesFile("./src/test/resources/DataShoppersStack.Properties", "Browser");
	
	if(BROWSER.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	if(BROWSER.equals("firefox")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
}
	if(BROWSER.equals("internetExplorer")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	String URL=dataProperties.dataFromPropertiesFile("./src/test/resources/DataShoppersStack.Properties", "url");
	driver.get(URL);
}



@org.testng.annotations.BeforeMethod(groups = {"regressiontestcase"})
public void BeforeMethod() throws Throwable
{

	DataUtillities dataProperties = new DataUtillities();
	
	
	String Email= dataProperties.dataFromExcel("C:\\Dataexcel\\DataExcel.xlsx", "Sheet1",1,1);
	String Pass= dataProperties.dataFromExcel("C:\\Dataexcel\\DataExcel.xlsx", "Sheet1",1,2);
	
	HomePageBeforeLogin HBL = new HomePageBeforeLogin(driver);
	HBL.getLoginMainButton().click();
	LoginPage Lp = new LoginPage(driver);
	Lp.getEmailTextField().sendKeys(Email);
	Lp.getPassTextField().sendKeys(Pass);
	Lp.getLoginButton().click();
	
	driver.close();
}
@org.testng.annotations.AfterMethod(groups = {"regressiontestcase"})
public void AfterMethod() throws Throwable{
	Thread.sleep(2000);
	HomePageAfterLogin HomePageEle = new HomePageAfterLogin(driver);
	
	HomePageEle.getAccountSettingIcon().click();
	HomePageEle.getLogoutIcon().click();
	
}
@org.testng.annotations.AfterClass(groups = {"regressiontestcase"})
public void AfterClass() {
	driver.quit();
}
}


	
	
