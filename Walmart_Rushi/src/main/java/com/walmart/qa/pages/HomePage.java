package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//span[@data-automation='account-user-name']")
	WebElement Accountspagelink;
	 
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public AccountsPage ClickonAccountsLink() {
		Accountspagelink.click();
		return new AccountsPage();
		
		
		
	}


}
