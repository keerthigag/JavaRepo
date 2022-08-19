package org.test;

#1) org.openqa.selenium.NoSuchElementException

driver.findElement(By.id("submit")).click();
Exception Handling:
 
try {
driver.findElement(By.id("submit")).click();
} catch (NoSuchElementException e)//command

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
try {
driver.findElement(By.id("submit")).click();
} catch (WebDriverException e) {
System.out.println(“An exceptional case.”);
}
} catch (TimeOutException e) {
System.out.println(“WebDriver couldn’t locate the element”);
}

#2)  org.openqa.selenium.NoSuchFrameException

try {
driver.switchTo().frame("frame_11");
} catch (NoSuchFrameException e)//command

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions.frameToBeAvaliableAndSwitchToIt(frame_11));
try {
driver.switchTo().frame("frame_11");
} catch (WebDriverException e) {
System.out.println(“An exceptional case”);
}
} catch (TimeOutException e) {
System.out.println(“WebDriver couldn’t locate the frame”);
}



#3) org.openqa.selenium.NoAlertPresentException
try {
driver.switchTo().alert().accept();
} catch (NoSuchAlertException e)//command

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions.alertIsPresent());
try {
driver.switchTo().alert().accept();
} catch (NoAlertPresentException e) {
System.out.println(“An exceptional case”);
}
} catch (TimeOutException e)
System.out.println(“WebDriver couldn’t locate the Alert”);
}


#4
org.openqa.selenium.TimeoutException will be thrown.

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

driver.get(“https://www.softwaretestinghelp.com” );



