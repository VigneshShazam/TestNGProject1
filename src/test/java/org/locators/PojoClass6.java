package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass6 extends SuperClass {
	public PojoClass6() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='product cb'])[9]")
	private WebElement RemoteToyProduct;

	public WebElement getRemoteToyProduct() {
		return RemoteToyProduct;
	}

}
