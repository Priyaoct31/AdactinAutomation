package org.testng;

import org.One.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClassA extends BaseClass {
	
	
	@Parameters({"Username", "Password"})
	@Test
	private void tc2(String user, String pass) {
		SoftAssert s = new SoftAssert();
	WebElement txtUsername = driver.findElement(By.id("username"));
	fillTextBox(txtUsername, user);
	s.assertTrue(false, "Username validation failed");
	System.out.println("Priya");
	
	WebElement txtPassword = driver.findElement(By.id("password"));
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
}
