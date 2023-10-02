package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.superclass.SuperClass;

public class PojoClass1 extends SuperClass {
	public PojoClass1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='query']")
	private WebElement Search;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement SearchBtn;

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

}
