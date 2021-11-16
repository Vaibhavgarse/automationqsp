package dynamicalytakeScreenshot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Actitime {
	static WebDriver driver;
  @Test
  public void f(String usn,String pass) throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  Thread.sleep(3000);
	  driver.findElement(By.id("loginButton")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-rr2cfcs/login.do");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider(name= "Actitime")
  public Object[][] dp(String usn,String pass) {
	  Object[][] data = new Object[3][2];
	  data[0][0]="admin";
	  data[0][1]="admin";
	  
	  data[1][0]="admin11";
	  data[1][1]="admin11";
	  
	  data[2][0]="xyz";
	  data[3][1]="manager";
	  
	return data;
    
    
  }
}
