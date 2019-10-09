package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class MyListsPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"save-list-input\"]")
	WebElement CreateNewListField;

	@FindBy(linkText = "Create List")
	WebElement CreateNewList;

	public MyListsPage() {
		PageFactory.initElements(driver, this);
	}

	public void CreateNewList(String listname) {
		CreateNewListField.sendKeys(listname);
		CreateNewList.submit();

	}

}
