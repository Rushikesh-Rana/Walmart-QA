package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.AccountsPage;
import com.walmart.qa.pages.AddressesPage;
import com.walmart.qa.pages.CreditCardPage;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.MyListsPage;
import com.walmart.qa.pages.MyRecommendationsPage;
import com.walmart.qa.pages.MyRegistriesPage;
import com.walmart.qa.pages.MySubscriptionsPage;
import com.walmart.qa.pages.OrderHistoryPage;
import com.walmart.qa.pages.PersonalSettingsPage;

public class AccountsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	AccountsPage accountspage;
	MyRecommendationsPage myrecommendationspage;
	OrderHistoryPage orderhistorypage;
	MySubscriptionsPage mysubscriptionspage;
	MyListsPage mylistspage;
	MyRegistriesPage myregistriespage;
	PersonalSettingsPage personalsettingspage;
	AddressesPage addressespage;
	CreditCardPage creditcardpage;
	MyAccountPage myaccountpage;
	
	
	
	
	
	
	
	public AccountsPageTest() {
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
		
		

	}

	@Test(priority = 1)
	public void clickonMyRecommendationslinkTest() {
		myrecommendationspage = accountspage.ClickonMyRecommendationslink();

	}

	@Test(priority = 2)
	public void clickonOrderHistoryLinkTest() {
		orderhistorypage = accountspage.ClickonOrderHistorylink();

	}

	@Test(priority = 3)
	public void clickonMysubscriptionsLinkTest() {
		mysubscriptionspage = accountspage.ClickonMySubscriptionslink();

	}

	@Test(priority = 4)
	public void clickonMyListslinkTest() {
		mylistspage = accountspage.ClickonMyListslink();

	}

	@Test(priority = 5)
	public void clickonMyRegistrieslinkTest() {
		myregistriespage = accountspage.ClickonMyRegistrieslink();
	}

	@Test(priority = 6)
	public void ClickonPersonalSettingslinkTest() {
		personalsettingspage = accountspage.CLickonPersonalSettingsLink();

	}
	@Test(priority =7)
	public void ClickonAddresseslinkTest() {
		addressespage=accountspage.CLickonAddressesLink();
		
	}
	@Test(priority = 8)
	public void ClickonCreditCardslinkTest() {
		creditcardpage=accountspage.ClickonCreditCardslink();
		
	}
	@Test(priority =9)
	public void ClickonSignOutLinkTest() {
		loginpage=accountspage.ClickonSignOutLink();
		
	}
	@Test (priority =10)
	public void ClickonMyAccountLinkTest() {
		myaccountpage=accountspage.ClickonMyAccountlink();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
