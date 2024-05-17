package org.helper_class_Luna;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Luna {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Select s;
	public static Robot r;
	public static Actions a;

	
	public static void down() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	
	public static void Enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void toPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	
	
	public static void toScrollUp(WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}
	public static void sysout(String text) {
		System.out.println(text);
	}

	public static void toScrollDown(WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}

	public static void launchUrl(WebDriver driver, String pgUrl) {
		driver.get(pgUrl);
	}

	public static void select(WebDriver driver, WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);
	}

	public static void selecttext(WebDriver driver, WebElement ele, String value) {
		s = new Select(ele);
		s.selectByVisibleText(value);
	}

	public static void maxWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	public static void clear(WebDriver driver, WebElement ele) {
		ele.clear();
	}

	
	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void toDoubleClick(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}


	
	public static void wait(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void fillTextBox(WebDriver driver, WebElement element, String textvalue) {
		element.sendKeys(textvalue);
	}

	public static void toClickButton(WebDriver driver, WebElement ref) {
		ref.click();
	}

	public static void takeSnapShot(WebDriver driver, String Name) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File S = scrShot.getScreenshotAs(OutputType.FILE);
		File D = new File("C:\\Users\\User\\eclipse-workspace2\\Lunajoy\\ScreenShot\\" + Name + ".png");
		FileUtils.copyFile(S, D);
	}

	public static void ScrollDown(WebDriver driver, WebElement web) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", web);

	}



}
