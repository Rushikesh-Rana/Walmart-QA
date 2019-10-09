package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class SearchPage extends TestBase {
	
	@FindBy(id = "global-search")
	WebElement Searchlink;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[2]/div/div[4]/form/button/span")
	WebElement Searchbutton;
	
	
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchitems(String ItemName) {
		Searchlink.sendKeys(ItemName);
		Searchbutton.click();
		
		
	}

}
