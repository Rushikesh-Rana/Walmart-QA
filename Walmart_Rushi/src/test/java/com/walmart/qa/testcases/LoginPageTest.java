package com.walmart.qa.testcases;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
//import com.walmart.qa.pages.AccountsPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test
	public void SigninTest() {
		homepage = loginpage.login("rushikeshrana90@yahoo.com", "Raa2231069");

	}

//	@AfterMethod
	// public void tearDown() {
	// driver.quit();
	// }
}
