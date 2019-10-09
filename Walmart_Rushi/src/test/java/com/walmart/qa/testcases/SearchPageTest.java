package com.walmart.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.SearchPage;

public class SearchPageTest extends TestBase {

	LoginPage loginpage;
	SearchPage searchpage;
	HomePage homepage;

	public SearchPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		loginpage.login("rushikeshrana90@yahoo.com", "Raa2231069");

	}

	/*@Test(priority = 2)
	public void SearchItemTest() throws InterruptedException {

		driver.findElement(By.id("global-search")).sendKeys("Protein Powder");
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[4]/form/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/section[2]/div[1]/div[1]/ul/li[2]/a"))
				.click();

	}

	@Test(priority = 1)
	public void VerifyItemsNumbersTest() throws InterruptedException {
		driver.findElement(By.id("global-search")).sendKeys("Protein Powder");
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[4]/form/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/section[2]/div[1]/div[1]/ul/li[2]/a"))
				.click();
		String ItemsNumber = driver.findElement(By.id("shelf-sort-count")).getText();
		System.out.println(ItemsNumber);
		Assert.assertEquals(ItemsNumber, "1 - 60 of 335 items", "Items number not matched");
	}
*/
	@Test
	public SearchPage PaginationTest() throws InterruptedException {
		driver.findElement(By.id("global-search")).sendKeys("Protein Powder");
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[4]/form/button/span")).click();
		Thread.sleep(5000);
		List pagination = driver.findElements(By.xpath("//a[@id='loadmore' and @class='page-select-list-button']"));
		if (pagination.size() > 0) {
			System.out.println("Pagination Exists" + pagination.size());

			for (int i = 0; i < pagination.size(); i++) {
				((WebElement) pagination.get(i)).click();
			}
		} else {
			System.out.println("Pagination does not Exist");

		}

		Select rangeselector = new Select(driver.findElement(By.xpath("//select[@class='page-select']")));
		rangeselector.selectByIndex(1);
		return new SearchPage();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}
}
