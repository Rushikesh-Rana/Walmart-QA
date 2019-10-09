package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class AddressesPage extends TestBase {
	
	@FindBy (id="shipping-first-name")
	WebElement Firstname;
	
	@FindBy (id="shipping-last-name")
	WebElement Lastname;
	
	@FindBy (id="shipping-address1")
	WebElement address;

	@FindBy (id="shipping-city")
	WebElement City;
	
	@FindBy (id="shipping-postal-code")
	WebElement postalcode;
	
	@FindBy (id="shipping-phone")
	WebElement Phone;
	
	@FindBy (linkText="Save")
	WebElement Savebutton;
	
	
	public AddressesPage() {
			PageFactory.initElements(driver, this);
		
		
	}
	
	
	public Filledaddresspage filladdress (String Fname,String Lname, String Address, String city, String Pcode, String phone) {
		
		Firstname.sendKeys(Fname);
		Lastname.sendKeys(Lname);
		address.sendKeys(Address);
		City.sendKeys(city);
		postalcode.sendKeys(Pcode);
		Phone.sendKeys(phone);
		Savebutton.click();
		return new Filledaddresspage();
		
		
	}

	
	
	
	
}
