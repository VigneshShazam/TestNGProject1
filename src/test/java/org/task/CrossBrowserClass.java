package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.superclass.SuperClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserClass {


	WebDriver driver;

	@Parameters({ "Browser" })
	@Test(priority = 1)

	private void Search(String s1) throws InterruptedException {
		if (s1.equals("ChromeBrowser")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (s1.equals("EdgeBrowser")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("https://www.onbuy.com/gb/");
		driver.manage().window().maximize();
		Thread.sleep(15000);

		driver.findElement(By.name("query")).sendKeys("Laptops");

		WebElement searchBtn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		searchBtn.click();

		long id = Thread.currentThread().getId();
		System.out.println("Search : " + id);
	}

	@Test(priority = 2)
	private void ClickBtn() {

		WebElement findProduct = driver.findElement(By.xpath("(//span[@class='image'])[1]"));
		findProduct.click();

		long id = Thread.currentThread().getId();
		System.out.println("ClickBtn : " + id);
	}

	@Test(priority = 3)
	private void ClickCart() {

		driver.findElement(By.xpath("(//a[@class='button green ag-pdp-coias'])[1]")).click();

		long id = Thread.currentThread().getId();
		System.out.println("ClickCart : " + id);

	}

}
