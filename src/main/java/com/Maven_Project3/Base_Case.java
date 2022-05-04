package com.Maven_Project3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Case {
	static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}
	
	//geturl
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	//sendkeys
	public static void textInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	//close
	public static void closeWindow() {
		driver.close();
	}
	
	//quit
	public static void quitWindow() {
		driver.quit();
	}
	
	//navigateTo
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	//navigateBack
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	//navigateForward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	//navigateRefresher
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	//click
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	//dropDown
	public static void dropDown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	//implicitewait
		public static void waitSleep() {
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		}
		
		//ScreenShot
		public static void screenShots(String location) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(location);
			FileUtils.copyFile(src, des);
		}
		
		//moveToElement
		public static void moveToElement(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();

		}
		
		//alert
		public static void alertMethod() {
			

		}

}
