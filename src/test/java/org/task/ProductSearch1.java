package org.task;

import org.locators.PojoClass1;
import org.locators.PojoClass2;
import org.locators.PojoClass3;
import org.openqa.selenium.WebElement;
import org.superclass.SuperClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProductSearch1 extends SuperClass {

	@BeforeClass(alwaysRun=true)
	private void LaunchURL() {
		openEdge();
		launchUrl("https://www.onbuy.com/gb/");
		maxwindow();
	}

	
	
	@BeforeMethod
	private void UsingWait() {
		getDateAndTime();
		toImplicitWait(30);

	}

	@Test(priority = 1,groups= { "Sanity","Smoke"})
	private void Search() {

		PojoClass1 v = new PojoClass1();
		WebElement search = v.getSearch();
		fillTextBox(search, "Laptops");

		WebElement searchBtn = v.getSearchBtn();
		toClick(searchBtn);
		
		long id = Thread.currentThread().getId();
		System.out.println("Search : " + id);
		
	}

	@Test(priority = 2,groups= { "Sanity","Smoke"})
	private void ClickBtn() {

		PojoClass2 v = new PojoClass2();

		WebElement firstProduct = v.getFirstProduct();
		toClick(firstProduct);
		
		long id = Thread.currentThread().getId();
		System.out.println("ClickBtn : " + id);

	}

	@Test(priority = 3,groups= { "Sanity","Smoke"})
	private void ClickCart() {
		PojoClass3 v = new PojoClass3();

		WebElement addCart = v.getAddCart();
		toClick(addCart);

		long id = Thread.currentThread().getId();
		System.out.println("ClickCart : " + id);
	}

	@AfterMethod(enabled = true)
	private void Print() {

		printUrl();
		getTitle();

		
	}

	@AfterClass
	private void CloseTheBrowser() {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("laptop"), "CheckAddCart Page");
		
		closeBrowser();

	}

}
