package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtillities {

	public void javaScriptClick1(WebDriver driver, WebElement ele){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0],click(),", ele);
		
	}
	public void javaScriptSendData(WebDriver driver, WebElement ele,String dataToSend){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0],value='gggg',", ele);
	}
	
	public void javaScriptHighLightElement(WebDriver driver, WebElement ele){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0],style.border='4px solid red';", ele);
	}
	public void javaScriptNormalScroll(WebDriver driver){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,300),");
	}
	public void javaScriptVerifyTitle(WebDriver driver, String expectedTitle){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
String actualTitle=(String) jse.executeScript("return document title");	
if(actualTitle.equals(expectedTitle)) {
	System.out.println("The title is same");
}
else
{
	System.out.println("The title is not same");

}
	}
	public void javaScriptVerifyUrl(WebDriver driver, String expectedUrl){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
String actualTitle=(String) jse.executeScript("return document Url");	
if(actualTitle.equals(expectedUrl)) {
	System.out.println("The Url is same");
}
else
{
	System.out.println("The Url is not same");	
}
//jse.executeScript("alert('ready to work');");
}
}