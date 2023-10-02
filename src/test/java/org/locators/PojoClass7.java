package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass7 extends SuperClass {
	public PojoClass7() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@data-product_id='25039479'])[2]")
	private WebElement Addcart;

	public WebElement getAddcart() {
		return Addcart;
	}

}
