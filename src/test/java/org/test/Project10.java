package org.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//CHROME
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Project10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","chromedriver.exe");

        WebDriver driver=new ChromeDriver();//IMPLICIT
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.navigate().to("https://askomdch.com/");
        driver.manage().window().maximize();//LAUNCH APP
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        js.executeScript("window.scrollBy(0,350)", "");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);//SCROLL DOWN
        driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[1]/div[2]/a[2]")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click(); //click cart
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click(); //VIEW cart

        js.executeScript("window.scrollBy(0,350)", "");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,350)", "");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("KEERTHIGA");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("VAISHNAVI");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"select2-billing_country-container\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"billing_city_field\"]")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("#2, BESANT NAGAR");
        driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("VANNANTHURAI");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("CALIFORNIA");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("85001");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,350)", "");

        driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("keerthiga@gmail.com");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //*[@id="billing_email"]

        driver.findElement(By.xpath("//*[@id=\"payment_method_cod\"]")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();

//        driver.findElement(By.xpath("")).click();



        

}
}
