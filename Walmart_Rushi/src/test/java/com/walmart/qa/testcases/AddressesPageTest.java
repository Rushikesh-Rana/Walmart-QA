package com.walmart.qa.testcases;

import org.openqa.selenium.By;import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.AccountsPage;
import com.walmart.qa.pages.AddressesPage;
import com.walmart.qa.pages.Filledaddresspage;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;

public class AddressesPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	AccountsPage accountspage;
	AddressesPage addressespage;
	Filledaddresspage filledaddresspage;
	
	public AddressesPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		loginpage.login("rushikeshrana90@yahoo.com", "Raa2231069");
		homepage = new HomePage();
		homepage.ClickonAccountsLink();
		accountspage = new AccountsPage();
		accountspage.CLickonAddressesLink();

	}

	@Test
	public void filladdress() {
		driver.findElement(By.id("shipping-first-name")).sendKeys("Rushikesh");
		driver.findElement(By.id("shipping-last-name")).sendKeys("Rana");
		driver.findElement(By.id("shipping-address1")).sendKeys("Glenwood School Drive");
		driver.findElement(By.id("shipping-city")).sendKeys("Burlington");
		driver.findElement(By.id("shipping-postal-code")).sendKeys("L7R3S2");
		driver.findElement(By.id("shipping-phone")).sendKeys("12345600");
		driver.findElement(By.linkText("Save")).click();
		
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
