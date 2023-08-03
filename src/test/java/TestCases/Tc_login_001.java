package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BaseClass;
import utilities.WebDriverUtillities;

public class Tc_login_001 extends BaseClass {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Dataexcel\\DataExcel.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		
		Workbook wookbook = WorkbookFactory.create(fileInput);
	 Sheet sheet = wookbook.getSheet("Sheet1");
		
		String PASS = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(PASS);
		
		
//		Row row=sheet.getRow(1);
//		Cell cell = row.getCell(2);
//		
//		String pass = cell.getStringCellValue();
//		System.out.println(pass);
		
		
		
//		Properties pro = new Properties();
//		pro.load(fileInput);
//		
//		String url = pro.getProperty("url");
//		String username = pro.getProperty("username");
//		String Password = pro.getProperty("Password");
//		
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(Password);

		

		
		
	
		
		
		
		
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
//ChromeDriver driver = new ChromeDriver();
//driver.get("https://shoppersstack.com/");
//WebDriverUtillities utill = new WebDriverUtillities();
//utill.takingScreenshotOfWebPage(driver);
	}

}
