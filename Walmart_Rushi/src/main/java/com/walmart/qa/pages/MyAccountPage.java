package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"add-recent-order-number\"]")
	WebElement OrderNumber;
	
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	
}
	
	public void EnterOrdernumber() {
		OrderNumber.sendKeys(prop.getProperty("OrderNumber"));
		
	}
	
	
}

 
