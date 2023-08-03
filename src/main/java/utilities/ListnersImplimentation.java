package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;

public class ListnersImplimentation extends BaseClass implements ITestListener {
	
	public void ontestFailure(ITestListener result) {
		
		String failedmethod = result.getMethod().getMethodName();
		System.out.println(failedmethod);
		
		TakeScreenshot ts = (TakeScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutType.File);
		File permanentFile = new File("./"+failedMethod+/"-failed.png");
		try {
			FileHandler.copy(tempFile, permanentFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
