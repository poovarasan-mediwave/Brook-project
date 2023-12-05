package Lib_Global;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();

		}
		;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static void getDrive(String url) {
		driver.get(url);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void frame_Into(WebElement frame) {
		driver.switchTo().frame(frame);

	}

	public static void frame_out() {
		driver.switchTo().defaultContent();

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void wait(int num) {

		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);

	}

	public void waitForElement(WebElement Element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(Element));
	}

	public static void EnterText(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static void ClickOnElement(WebElement element) {
		element.click();

	}

	public String gettText(WebElement b) {
		String text = b.getText();
		return text;
	}

	public String gettext(List<WebElement> calender) {
		String text = ((WebElement) calender).getText();
		return text;

	}

	public void screenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),
				new File(System.getProperty("user.dir") + "\\screenshot\\" + path + ".png"));
	}

	public boolean displayedMethod(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public void sleep(int num) throws InterruptedException {

		Thread.sleep(num);
	}

	public static void screenshot(String file) throws Exception {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File(System.getProperty("user.dir") + "\\Screenshot\\" + file);
		FileUtils.copyFile(sou, Des);
	}


	public static void selectbyindex(WebElement element, int num) {
		Select se = new Select(element);
		se.selectByIndex(num);

	}

	public static void selectbyvalue(WebElement element, String num) {
		Select se = new Select(element);
		se.selectByValue(num);

	}

	public static void selectbyVisibleText(WebElement element, String num) {
		Select se = new Select(element);
		se.selectByVisibleText(num);

	}

	public static void browserquit() {
		driver.quit();
	}

	public static void close() {
		
		driver.close();
	}

	public static void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollUpElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void jsclick(WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", webElement);
	}


}
