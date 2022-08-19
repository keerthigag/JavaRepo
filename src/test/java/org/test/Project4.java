package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Project4 {
	
	
		public static void main(String args[]) throws InterruptedException {
			
			System.setProperty("webdriver.geckodriver","geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.navigate().to("https://askomdch.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,+1000)", "");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("shoes");
			js.executeScript("window.scrollBy(0,+1000)", "");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-350)", "");
			driver.findElement(By.xpath("/html/body/div/header/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/nav/div/ul/li[4]/a")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,+450)", "");
			
				
	}
	}
