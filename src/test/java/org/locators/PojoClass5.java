package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass5 extends SuperClass {
	public PojoClass5() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='                    View all Electronic Toys                ']")
	private WebElement ViewAllElectronicToys;

	@FindBy(xpath = "//span[text()='Remote Control Toys']")
	private WebElement RemoteToys;

	public WebElement getViewAllElectronicToys() {
		return ViewAllElectronicToys;
	}

	public WebElement getRemoteToys() {
		return RemoteToys;
	}

}
