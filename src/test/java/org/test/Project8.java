package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project8 {
	public static void main(String args[]) throws InterruptedException {
		
System.setProperty("webdriver.chromedriver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://askomdch.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,+1000)", "");
		Thread.sleep(300);
		driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[3]")).click();
		js.executeScript("window.scrollBy(0,+800)", "");
		Thread.sleep(1000);
		
		 js.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(1000);
	        
		driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
		Thread.sleep(1000);
		
		 js.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	        Thread.sleep(2000);
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("KEERTHIGA");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("VAISHNAVI");
	        Thread.sleep(1000);
		
	        
	        
	}
}
	    
	    
	    
	    
	    
	    
	    