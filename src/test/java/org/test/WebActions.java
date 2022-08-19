package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebActions {
	public static void main(String args[]) {
	
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		Actions acc = new Actions(driver);
        WebElement txtUsername = driver.findElement(By.name("q"));
        org.openqa.selenium.interactions.Action seriesOfActions = acc
            .moveToElement(txtUsername)
            .click()
            .keyDown(txtUsername, Keys.SHIFT)
            .sendKeys(txtUsername, "hello")
            .keyUp(txtUsername, Keys.SHIFT)
            .doubleClick(txtUsername)
            .contextClick()
            .build();
            
        seriesOfActions.perform() ;
		
		
}
}
