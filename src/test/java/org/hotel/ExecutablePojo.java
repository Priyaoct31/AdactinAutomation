package org.hotel;

import java.io.IOException;
import org.One.BaseClass;

public class ExecutablePojo extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		chromeBrowser();
		launchUrl("https://adactinhotelapp.com/index.php");
		maxWindow();	
		
		LoginPojo lp = new LoginPojo();	
		fillTextBox(lp.getUsrName(), readFromExcel(1, 0));	
		fillTextBox(lp.getUsrPassw(), readFromExcel(1, 1));		
		btnClick(lp.getLoginBtn());
	
		Pojo1 lp1 = new Pojo1();
		dropdownValues(lp1.getUsrLocation(), 2);
		dropdownValues(lp1.getHotelType(), 2);
		dropdownValues(lp1.getRoomType(), 2);
		dropdownValues(lp1.getRoomNumb(), 2);
		fillTextBox(lp1.getChkIn(), readFromExcel(1, 2));
		fillTextBox(lp1.getChkOut(), readFromExcel(1, 3));
		dropdownValues(lp1.getAdultRoom(), 2);
		dropdownValues(lp1.getChildRoom(), 2);
		btnClick(lp1.getSrchButton());
		
		Pojo2 lp2 = new Pojo2();
		btnClick(lp2.getRadButton());
		btnClick(lp2.getContinueBtn());
		
		Pojo3 lp3 = new Pojo3();
		fillTextBox(lp3.getFirstName(), readFromExcel(1,4));
		fillTextBox(lp3.getLastName(), readFromExcel(1,5));
		fillTextBox(lp3.getUsrAddress(), readFromExcel(1,6));
		fillTextBox(lp3.getCreditCard(), readFromExcel(1,7));
		dropdownValues(lp3.getCreditCardType(),2);
		dropdownValues(lp3.getCcMonth(),8);
		dropdownValues(lp3.getCcYear(),12);
		fillTextBox(lp3.getCvvNumber(),readFromExcel(1,8));
		btnClick(lp3.getBookNowButton());
		
		pauseProgram();
		
		Pojo4 lp4 = new Pojo4();
		orderNumber(lp4.getOrderNumber());
		writeInExcel(1, 9, s5, lp4.getOrderNumber());
	
	}
	
	

}
