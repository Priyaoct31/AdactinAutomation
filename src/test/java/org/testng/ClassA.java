package org.testng;

import org.One.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA extends BaseClass {
	
	
	@Parameters({"Username", "Password"})
	@Test
	private void tc2(@Optional("default_username") String username) {
		SoftAssert s = new SoftAssert();
	WebElement txtUsername = driver.findElement(By.id("username"));
	String user = null;
	fillTextBox(txtUsername, user);
	s.assertTrue(false, "Username validation failed");
	System.out.println("Priya");
	
	WebElement txtPassword = driver.findElement(By.id("password"));
	String pass = null;
	fillTextBox(txtPassword, pass);
	

	}
	
	@Test
	private void tc1() {
		System.out.println("Test Case 4");

	}
	
	@Test
	private void execute() {
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/index.php");
		maxWindow();

	}
	
	@BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) {
        
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        
        // Launch the application
        driver.get("https://adactinhotelapp.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin(@Optional("default_username") String username) {
        
        WebElement username1 = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        // Perform actions
        username1.sendKeys("Priya3110"); 
        password.sendKeys("7PVQ16"); 
        loginButton.click();

        // Verify successful login by checking URL or page elements
        String expectedUrl = "https://adactinhotelapp.com/SearchHotel.php";
        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.equals(expectedUrl) : "Login Test Failed! Expected: " + expectedUrl + ", but got: " + actualUrl;
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

