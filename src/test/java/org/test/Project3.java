package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project3 {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.geckodriver","geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.github.com");

}
}
