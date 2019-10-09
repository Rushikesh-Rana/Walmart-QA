package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.AccountsPage;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;

public class MyAccountTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	AccountsPage accountspage;
	MyAccountPage myaccountpage;
	
	
	public MyAccountTest() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		loginpage.login("rushikeshrana90@yahoo.com", "Raa2231069");
		homepage = new HomePage();
		homepage.ClickonAccountsLink();
		

}
	@Test
	public void EnterOrderNumberTest() {
		myaccountpage.EnterOrdernumber();
	
}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
