import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class ClassName {
	 
	    public static void main(String[] args) {
	       
	        
	    	 @Given("the browser window is open ")
	        WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        driver.manage().window().maximize();
	        
	        @Given("user navigates to amazon") 
	 	   public void goToAmazon() { 
	 	      driver = new ChromeDriver(); 
	 	     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html ");
	 	   } 

	      
	        @When("Enter the class name1")
	       driver.findElement(By.xpath("//a[@href='By.ByClassName.html']"));'].click();
	 
	        @When("Enter the class name2")
	        driver.findElement(By.xpath("//a[//a[@href='By.ByCssSelector.html']']"));'].click();
	 
	        
	        driver.quit();
	        
	    }
	}
