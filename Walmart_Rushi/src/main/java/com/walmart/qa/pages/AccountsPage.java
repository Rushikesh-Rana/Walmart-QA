package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class AccountsPage extends TestBase {

	@FindBy(linkText = "My Recommendations")
	WebElement RecommendationsPagelink;

	@FindBy(linkText = "Order History")
	WebElement OrderHistorylink;

	@FindBy(linkText = "My Account")
	WebElement MyAccountlink;

	@FindBy(linkText = "My Subscriptions")
	WebElement MySubscriptionslink;

	@FindBy(linkText = "My Lists")
	WebElement MyListslink;

	@FindBy(linkText = "My Registries")
	WebElement MyRegistrieslink;

	@FindBy(linkText = "Personal Settings")
	WebElement PersonalSettingslink;

	@FindBy(linkText = "Addresses")
	WebElement Addresseslink;

	@FindBy(linkText = "Credit Cards")
	WebElement CreditCardslink;

	@FindBy(linkText = "Sign Out")
	WebElement SignOutlink;

	public AccountsPage() {
		PageFactory.initElements(driver, this);

	}

	public MyRecommendationsPage ClickonMyRecommendationslink() {
		RecommendationsPagelink.click();
		return new MyRecommendationsPage();

	}

	public OrderHistoryPage ClickonOrderHistorylink() {
		OrderHistorylink.click();
		return new OrderHistoryPage();

	}

	public MyAccountPage ClickonMyAccountlink() {
		MyAccountlink.click();
		return new MyAccountPage();
	}

	public MySubscriptionsPage ClickonMySubscriptionslink() {
		MySubscriptionslink.click();
		return new MySubscriptionsPage();

	}

	public MyListsPage ClickonMyListslink() {
		MyListslink.click();
		return new MyListsPage();

	}

	public MyRegistriesPage ClickonMyRegistrieslink() {
		MyRegistrieslink.click();
		return new MyRegistriesPage();

	}

	public PersonalSettingsPage CLickonPersonalSettingsLink() {
		PersonalSettingslink.click();
		return new PersonalSettingsPage();

	}

	public AddressesPage CLickonAddressesLink() {
		Addresseslink.click();
		return new AddressesPage();

	}

	public CreditCardPage ClickonCreditCardslink() {
		CreditCardslink.click();
		return new CreditCardPage();

	}

	public LoginPage ClickonSignOutLink() {
		SignOutlink.click();
		return new LoginPage();

	}
}
