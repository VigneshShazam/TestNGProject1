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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProductSearch3 extends SuperClass {

	@BeforeClass(alwaysRun=true)
	private void LaunchURL() {
		openEdge();
		launchUrl("https://www.onbuy.com/gb/");
		maxwindow();
	}

	@BeforeMethod
	private void UsingWait() {
		toImplicitWait(30);
		getDateAndTime();
	}

	@Parameters({ "Produc" })
	@Test(priority = 1, groups = { "Sanity","Regression"})

	private void Search(@Optional("Jewellery Watches") String s1) {

		PojoClass1 v = new PojoClass1();
		WebElement search = v.getSearch();
		fillTextBox(search, s1);

		WebElement searchBtn = v.getSearchBtn();
		toClick(searchBtn);
		
		long id = Thread.currentThread().getId();
		System.out.println("Search : " + id);
	}

	@Test(priority = 2, groups = { "Sanity","Regression"})
	private void ClickBtn() {

		PojoClass2 v = new PojoClass2();

		WebElement firstProduct = v.getFirstProduct();
		toClick(firstProduct);

		long id = Thread.currentThread().getId();
		System.out.println("ClickBtn : " + id);
	}

	@Test(priority = 3, groups = { "Sanity","Regression"})
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
		Assert.assertTrue(currentUrl.contains("watch"), "CheckAddCart Page");
		
		closeBrowser();

	}

}
