package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Project7 {
    public static void main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.msedgedriver","msedgedriver.exe"); 
    WebDriver driver=new EdgeDriver();
    driver.navigate().to("https://demoqa.com/automation-practice-form");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).click();
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Keerthiga");
   
    }



}