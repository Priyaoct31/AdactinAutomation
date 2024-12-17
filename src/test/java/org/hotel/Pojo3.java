package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends Pojo2 {
	
	public Pojo3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id = "first_name"),
		@FindBy(name="first_name")		
	})
	
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement usrAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditCard;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNowButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getUsrAddress() {
		return usrAddress;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

}
