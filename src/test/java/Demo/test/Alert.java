package Demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	
		public static void main(String args[]) throws InterruptedException {
		
			System.setProperty("webdriver.chromedriver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			 
}
}

		
