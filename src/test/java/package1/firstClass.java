package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstClass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "./src/main/resources/Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://shoppersstack.com/");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    WebElement loginButton = driver.findElement(By.id("loginBtn"));
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("arguments[0].click();", loginButton);
   
    
    WebElement UsernameTextField = driver.findElement(By.id("Email"));
    jse.executeScript("arguments[0].value='rabiya';",UsernameTextField);
    		
   WebElement passTextField = driver.findElement(By.xpath("//div[@class='MuiFormControl-root']"));
    jse.executeScript("arguments[0].style.border ='4px solid red';", passTextField);
    
    String Title=(String) jse.executeScript("return document title;");	
	System.out.println("Title");
	if(Title.equals("ShoppersStack | Login")) {
		System.out.println("same page displayed");
	}
	else {
		System.out.println("same page not displayed");
	}
	String Url=(String) jse.executeScript("return document Url;");	
	System.out.println("Url");
	if(Url.equals("https://shoppersstack.com/user-signin")) {
		System.out.println("same Url displayed");
	}
	else {
		System.out.println("same Url not displayed");
    
	}

}
}