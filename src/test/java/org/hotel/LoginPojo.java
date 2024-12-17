package org.hotel;

import org.One.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usrName;
	
	@FindBy(id="password")
	private WebElement usrPassw;
	
	@FindBy(id="login")
	private WebElement loginBtn;

	public WebElement getUsrName() {
		return usrName;
	}

	public WebElement getUsrPassw() {
		return usrPassw;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}
