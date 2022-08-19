package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Project5 {
	
	
		public static void main(String args[]) throws InterruptedException {
			
			System.setProperty("webdriver.geckodriver","geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.navigate().to("https://www.jio.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/section[1]/header/section/div/section[2]/nav/ul/li[4]/section/a")).click();
	}
	}

