package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends Pojo3 {
	
	public Pojo4() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNumber1;

	public WebElement getOrderNumber() {
		return orderNumber1;
	}
	

}
