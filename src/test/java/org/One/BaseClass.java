package org.One;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Select s;
	public static int x, length;
	public static JavascriptExecutor js;
	public static File f,d1;
	public static String str,s4,s5;
	
	
	
	public static void chromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\NEW\\AdactinAutomation\\Driver\\chrome.exe");
		
		driver = new ChromeDriver();
		
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void btnClick(WebElement buttonClick) {
		buttonClick.click();
		
	}
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void pauseProgram() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void clickDouble(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void dropdownValues(WebElement element3, int numb) {
		
		s= new Select(element3);
		s.selectByIndex(numb);
	}
	
	public static void ccValidation(String c) {
	
		if(c.length()<16) {
			
			System.out.println("Enter a valid 16 digit CC Number");
			driver.quit();
		}
	}
	
	public static void orderNumber(WebElement element4) {
		js = (JavascriptExecutor)driver;
		String s4 = element4.getAttribute("value");
		System.out.println("Order# is :"+s4);
	}
	
	public static void pictures(String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		f = ts.getScreenshotAs(OutputType.FILE);
		d1 = new File("C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Pictures\\"+filename+".png");
		FileHandler.copy(f, d1);
	}
	
	
	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
	
	File f = new File("C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Excel\\AdactinData.xlsx");
	FileInputStream fin = new FileInputStream(f);
	XSSFWorkbook book = new XSSFWorkbook(fin);		
	XSSFSheet sh = book.getSheet("Adactin");
	XSSFRow r = sh.getRow(rowNo);
	XSSFCell c = r.getCell(cellNo);
	int type = c.getCellType();
	String name = "";
	if(type==1) {
		name = c.getStringCellValue();
		
	}
	else if(DateUtil.isCellDateFormatted(c)){
		Date d = c.getDateCellValue();
		SimpleDateFormat form = new SimpleDateFormat("dd-MM-yy");
		name = form.format(d);
		
	}
	else {
		double d = c.getNumericCellValue();
		long l = (long)d;
		name = String.valueOf(l);
	}
	
	
	
	return name;
	
}
	public static void writeInExcel(int rowNo, int cellNo, String name1, WebElement element5) throws IOException {
		
		File f = new File("C:\\Users\\pc\\eclipse-workspace\\NEW\\PriyaMvn\\Excel\\AdactinData.xlsx");
		FileInputStream fin = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fin);		
		XSSFSheet sh = book.getSheet("Adactin");
		XSSFRow r = sh.getRow(rowNo);
		XSSFCell c = r.createCell(cellNo);
		js = (JavascriptExecutor)driver;
		String s5 = element5.getAttribute("value");		
		c.setCellValue(s5);
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		
		System.out.println("Updated in Excel");
	
		
		
		
	}
}
