package org.test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
//CHROME
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
	//import org.openqa.selenium.support.ui.Select;

	public class Project9 {
	    public static void main(String[] args) throws InterruptedException,IOException {
	        System.setProperty("webdriver.chromedriver","chromedriver.exe");
	      


	        WebDriver driver=new ChromeDriver();
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        driver.navigate().to("https://askomdch.com/");
	        driver.manage().window().maximize();//LAUNCH APP
	        Thread.sleep(3000);

	        js.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(2000);//SCROLL DOWN
	        driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]")).click();
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click(); //click cart
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click(); //VIEW cart

	        js.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(1000);
	        js.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(1000);
	        
	        
	           File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        
		        FileHandler.copy(scrFile, new File("screenshot.png"));//screenshot

	        driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("KEERTHIGA");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("VAISHNAVI");
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//*[@id=\"select2-billing_country-container\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]/b")).click();
	        driver.findElement(By.xpath("//*[@id=\"billing_city_field\"]")).click();
	        Thread.sleep(1000);



	        driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("#2, BESANT NAGAR");
	        driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("VANNANTHURAI");
	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("CALIFORNIA");
	        Thread.sleep(2000);
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")).click();
	        driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).click();
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("85001");
	        Thread.sleep(2000);
	        js.executeScript("window.scrollBy(0,350)", "");

	        driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("keerthiga@gmail.com");
	        Thread.sleep(1000);
	        //*[@id="billing_email"]

	        driver.findElement(By.xpath("//*[@id=\"payment_method_cod\"]")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();

//	        driver.findElement(By.xpath("")).click();
	        
	        


	        

}
	}
