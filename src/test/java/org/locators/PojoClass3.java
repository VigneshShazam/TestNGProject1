package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass3 extends SuperClass {
	public PojoClass3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='button green ag-pdp-coias'])[1]")
	private WebElement AddCart;

	public WebElement getAddCart() {
		return AddCart;
	}

}
