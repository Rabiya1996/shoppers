package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtillities {

	private static final String Url = null;

	public void takingScreenshotOfWebPage(WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		String TimeStamp=LocalDateTime.now().toString().replace(':',',');
		File parmentFile = new File("./Screenshot/"+TimeStamp+"WebPage.png");
		FileHandler.copy(tempfile, parmentFile);
		
	}
	public void takingScreenshotOfWebElement(WebDriver driver,WebElement element) throws IOException{
		File tempfile = element.getScreenshotAs(OutputType.FILE);
		String TimeStamp=LocalDateTime.now().toString().replace(':',',');
		File parmentFile = new File("./Screenshot/"+TimeStamp+"WebElement.png");
		FileHandler.copy(tempfile, parmentFile);
	
}
	public void waitTillElementVisible1(WebDriver driver,WebElement element) throws IOException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitTillAlertPopUpPresent(WebDriver driver,WebElement element) throws IOException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void waitTillElementToBeSelected(WebDriver driver,WebElement element) throws IOException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitTillUrlToBeMatch(WebDriver driver,WebElement element) throws IOException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlMatches(Url));
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
