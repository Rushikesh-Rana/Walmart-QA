package com.walmart.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.AccountsPage;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	AccountsPage accountspage;
	
	
	public HomePageTest() {
		super();
		
	}

	
	@BeforeMethod
	public void setup() {
		initialization();

	 loginpage = new LoginPage();
	 loginpage.login("rushikeshrana90@yahoo.com", "Raa2231069");
	 homepage = new HomePage();
	}
	 
	
	@Test(priority =1 )
		public void ClickonAccountslinkTest() {
		accountspage=homepage.ClickonAccountsLink();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();}

	}
