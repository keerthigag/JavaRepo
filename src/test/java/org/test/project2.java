package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class project2 {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.msedgedriver","msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.javatpoint.com");
		
		
}

}
