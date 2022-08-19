package keerthiga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderTest {

@Test(dataProvider="testdata")
public void TestChrome(String username,String password){
System.setProperty("webdriver.chrome.driver",);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://amazon.com/login");
driver.findElement(By.name("tagname[@attribute = ‘username/email’]")).clear();
driver.findElement(By.name("tagname[[@attribute = ‘username/email’]")).sendKeys(username);
driver.findElement(By.name("tagname[@attribute = ‘password’]")).clear();
driver.findElement(By.name("tagname[[@attribute = ‘password’]")).sendKeys(password);
}

@DataProvider(name="testdata")
public Object[][] TestDataFeed(){
Object [][] amazondata=new Object[2][2];


amazondata[0][0]="username1@gmail.com";

amazondata[0][1]="Password1";

amazondata[1][0]="username2@gmail.com";

amazondata[1][1]="Password2";

return amazondata;
}
}

