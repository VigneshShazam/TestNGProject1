package org.superclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass extends ExcelHelper {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert al;
	public static Select s;

	// 1
	public static void openChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}// 2

	public static void openEdge() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}// 3

	public static void openGecko() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// 4
	public static void closeBrowser() {
		driver.quit();

	}// 5

	public static void closeCurrentTab() {
		driver.close();

	}

	// 6
	public static void launchUrl(String pgUrl) {
		driver.get(pgUrl);
	}

	// 7
	public static void getTitle() {
		String titleName = driver.getTitle();
	}

	// 8
	public static void printUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
	} // 9

	public static void maxwindow() {
		driver.manage().window().maximize();

	}

	// 10
	public static void toReload() {
		driver.navigate().refresh();

	} // 11

	public static void toForward() {

		driver.navigate().forward();
	}

	// 12
	public static void toback() {
		driver.navigate().back();
	}// 13

	public static void fillTextBox(WebElement element, String input) {
		element.sendKeys(input);
	}

	// 14
	public static void toClick(WebElement element) {
		element.click();
		// 15
	}

	public static void printText(WebElement element) {
		String txt = element.getText();
		System.out.println(txt);
	}

	// 16
	public static void printAttribute(WebElement element) {
		String atr = element.getAttribute("value");
		System.out.println(atr);

	}

	// 17
	public static void hold(int time) throws InterruptedException {
		Thread.sleep(time);

	}

	// 18
	public static void mousehovering(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();

	}

	// 19
	public static void todragAndDrop(WebElement e1, WebElement e2) {
		a = new Actions(driver);
		a.dragAndDrop(e1, e2);

	}

	// 20
	public static void toDoubleClick(WebElement e) {
		a = new Actions(driver);
		a.doubleClick(e);

	}

	// 21
	public static void toContextClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element);
	}

	// 22
	public static void toKeyUp(WebElement element) {
		a = new Actions(driver);
		a.keyUp(Keys.SHIFT);

	}// 23

	public static void toKeyDown(WebElement element) {
		a = new Actions(driver);
		a.keyDown(Keys.SHIFT);

	}

	// 24
	public static void enterKey(WebElement element) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}// 25

	public static void toShiftKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}// 26

	public static void toBackspace() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	// 27
	public static void toTabKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	} // 28

	public static void toAlt() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);

	}// 29

	public static void toSpace() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);

	}

	// 30
	public static void toControl() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	// 31
	public static void toCntrl() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	// 32
	public static void toCapsLock(WebElement element, String input) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		element.sendKeys(input);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

	}
	// 33

	public static void toDelete() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}

	// 34
	public static void fillUpsJs(WebElement element, String input) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" + input + "')", element);
	}

	// 35
	public static void returnjs(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);
	}
	// 36

	public static void toscrolldown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(true)", element);

	}

	// 37
	public static void toscrollUp(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(false)", element);

	}

	// 38
	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();

	}

	// 39
	public static void TocancelAlert() {
		al = driver.switchTo().alert();
		al.dismiss();

	}

	// 40
	public static void takescreenshot(String Picture) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File sr = tk.getScreenshotAs(OutputType.FILE);
		File de = new File("C:\\Users\\Admin\\eclipse-workspace\\Mavenday1\\ScreenShot\\" + Picture + ".png");
		FileUtils.copyFile(sr, de);
	}

	// 41
	public static void linkCount() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("No of links:" + allLinks.size());

	}

	// 42
	public static void tableCount() {
		List<WebElement> allTable = driver.findElements(By.tagName("table"));
		System.out.println("No of tables:" + allTable.size());
	}

	// 43
	public static void frameCount() {
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames:" + allFrames.size());

	}

	// 44
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// 45
	public static void defaultFrame() {
		driver.switchTo().defaultContent();

	}

	// 46
	public static void windowHandles(int value) {
		Set<String> allWin = driver.getWindowHandles();

		List<String> allId = new ArrayList<String>(allWin);

		driver.switchTo().window(allId.get(value));

	}

	// 47 Select[DropDown]
	public static void selectUsingText(WebElement element, int indexNo) {
		s = new Select(element);
		s.selectByIndex(indexNo);
	}

	// 48
	public static void selectUsingVisibleText(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);

	}

	// 49
	public static void selectUsingValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	// 50

	public static void toCheckIsMultiple(WebElement element) {
		s = new Select(element);
		if (s.isMultiple()) {
			System.out.println("It is the multiple dropdown");

		}

	}

	// 51
	public static void printAllOption(WebElement element) {
		s = new Select(element);
		List<WebElement> allOption = s.getOptions();
		for (WebElement eachOption : allOption) {
			System.out.println(eachOption.getText());

		}
	}

	// 52
	public static void printAllSelectedOption(WebElement element) {
		s = new Select(element);
		List<WebElement> allselected = s.getAllSelectedOptions();
		System.out.println("The selected all option:" + allselected);
	}

	// 53
	public static void printgetFirstSelectedOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelected = s.getFirstSelectedOption();
		System.out.println("The select First select option:" + firstSelected);

	}

	// 54
	public static void deselectUsingValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue("value");
	}

	// 55
	public static void deselectUsingIndex(WebElement element, int indexNo) {
		s = new Select(element);
		s.deselectByIndex(indexNo);
	}

	// 56
	public static void deselectUsingVisibleText(WebElement element, String value) {
		s = new Select(element);
		s.deselectByVisibleText("Value");

	}

	// 57
	public static void deselectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	//58
	public static void toImplicitWait(int Sec) {
		driver.manage().timeouts().implicitlyWait(Sec, TimeUnit.SECONDS);
	}

	//59
	public static void getDateAndTime() {

		Date d = new Date();
		System.out.println(d);
	}	
	
}
