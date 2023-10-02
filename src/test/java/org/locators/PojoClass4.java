package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass4 extends SuperClass {
	public PojoClass4() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@data-toggle='header-menu-open']")
	private WebElement HeaderMenu;

	@FindBy(xpath = "(//a[@class='menu-item'])[5]")
	private WebElement ToysandGames;

	@FindBy(xpath = "(//li[@data-c='2308'])[2]")
	private WebElement ElectronicToys;

	

	public WebElement getHeaderMenu() {
		return HeaderMenu;
	}

	public WebElement getToysandGames() {
		return ToysandGames;
	}

	public WebElement getElectronicToys() {
		return ElectronicToys;
	}

}
