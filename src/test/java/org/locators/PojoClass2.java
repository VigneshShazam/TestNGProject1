package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass2 extends SuperClass {
	public PojoClass2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='image'])[1]")
	private WebElement FirstProduct;

	public WebElement getFirstProduct() {
		return FirstProduct;
	}

}
