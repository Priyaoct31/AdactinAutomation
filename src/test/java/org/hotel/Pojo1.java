package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends LoginPojo {
	
	public Pojo1() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement usrLocation;	
	@FindBy(id="hotels")
	private WebElement hotelType;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNumb;
	@FindBy(id="datepick_in")
	private WebElement chkIn;
	@FindBy(id="datepick_out")
	private WebElement chkOut;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement srchButton;
	
	
	public WebElement getUsrLocation() {
		return usrLocation;
	}
	public WebElement getHotelType() {
		return hotelType;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNumb() {
		return roomNumb;
	}
	public WebElement getChkIn() {
		return chkIn;
	}
	public WebElement getChkOut() {
		return chkOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSrchButton() {
		return srchButton;
	}

}
