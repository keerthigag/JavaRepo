package Demo.test;


	
	import java.util.concurrent.TimeUnit;  
		import org.openqa.selenium.By;  
		import org.openqa.selenium.WebDriver;  
		import org.openqa.selenium.WebElement;  
		import org.openqa.selenium.chrome.ChromeDriver;  
		import org.openqa.selenium.support.ui.ExpectedConditions;  
		import org.openqa.selenium.support.ui.WebDriverWait;  
		
		public class Implicitwait{  
		public static void main(String[] args) throws InterruptedException  
		{  
			System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();  
		driver.manage().timeouts().pageLoadTimeout(40,   
		TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		// Implicit Wait for 20 seconds  
		driver.get("https://www.google.com");  
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello"); //Finding element and   
		Thread.sleep(1000);  
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span/svg/path']")).click(); //Clicking on the next button if element is located  
		}  
		}  





