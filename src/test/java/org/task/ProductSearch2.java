package org.task;

import java.util.Currency;

import org.locators.PojoClass4;
import org.locators.PojoClass5;
import org.locators.PojoClass6;
import org.locators.PojoClass7;
import org.openqa.selenium.WebElement;
import org.superclass.SuperClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductSearch2 extends SuperClass {

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

	@Test(priority = 1, groups = { "Sanity","Trinity"})
	private void UsingClick() {

		PojoClass4 v = new PojoClass4();

		WebElement headerMenu = v.getHeaderMenu();
		toClick(headerMenu);

		WebElement toysandGames = v.getToysandGames();
		mousehovering(toysandGames);
		toClick(toysandGames);

		WebElement electronicToys = v.getElectronicToys();
		mousehovering(electronicToys);
		toClick(electronicToys);

		
		long id = Thread.currentThread().getId();
		System.out.println("UsingClick : " + id);

	}

	@Test(priority = 2, groups = { "Sanity","Trinity"})
	private void ProductSearch() {

		PojoClass5 vk = new PojoClass5();

		WebElement viewAllElectronicToys = vk.getViewAllElectronicToys();
		mousehovering(viewAllElectronicToys);
		toClick(viewAllElectronicToys);
		
		WebElement remoteToys = vk.getRemoteToys();
		mousehovering(remoteToys);
		toClick(remoteToys);
		
		long id = Thread.currentThread().getId();
		System.out.println("ProductSearch : " + id);

	}

	@Test(priority = 3, groups ={ "Sanity","Trinity"})
	private void ProductClick() {

		PojoClass6 vk = new PojoClass6();

		WebElement remoteToyProduct = vk.getRemoteToyProduct();
		toClick(remoteToyProduct);
	}

	@Test(priority = 4, groups =  { "Sanity","Trinity"})
	private void ProductAddcart() {

		PojoClass7 vk = new PojoClass7();

		WebElement addcart = vk.getAddcart();
		toClick(addcart);
		
		long id = Thread.currentThread().getId();
		System.out.println("ProductAddcart : " + id);

	}

	@AfterMethod(enabled = true)
	private void Print() {

		printUrl();
		getTitle();
		
	}

	@AfterClass
	private void CloseTheBrowser() {

		SoftAssert s = new SoftAssert();
		String currentUrL = driver.getCurrentUrl();
		s.assertTrue(currentUrL.contains("remote-control"), "CheckAddCart Page");

		closeBrowser();

	}

}
