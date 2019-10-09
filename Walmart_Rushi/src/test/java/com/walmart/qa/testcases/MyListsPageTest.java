package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.AccountsPage;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyListsPage;

public class MyListsPageTest extends TestBase {

	LoginPage loginpage;
	AccountsPage accountspage;
	HomePage homepage;
	MyListsPage mylistpage;

	public MyListsPageTest() {
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
		accountspage.ClickonMyListslink();
		mylistpage = new MyListsPage();

	}

	@Test
	public void CreateNewListTest() {
		mylistpage.CreateNewList("List no 2");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
