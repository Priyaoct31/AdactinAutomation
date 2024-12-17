package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends Pojo1 {
	
	public Pojo2() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="radiobutton_0")
	private WebElement radButton;
	
	@FindBy(name = "continue")
	private WebElement continueBtn;

	public WebElement getRadButton() {
		return radButton;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
}
