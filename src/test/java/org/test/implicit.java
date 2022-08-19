package org.test;
	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class implicit {

	private WebDriver driver;
	private String baseUrl;
	private WebElement element;

	@BeforeMethod
	public void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "http://www.google.com";
	driver.manage().timeouts

}
	}
