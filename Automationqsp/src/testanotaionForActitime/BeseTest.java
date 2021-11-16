package testanotaionForActitime;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeseTest {
	 WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is the employee time sheet tool for maintaining the record of employees",true);
  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
  }
  

  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://desktop-rr2cfcs/login.do");
	 
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

 

  @AfterClass
  public void afterClass() {
  }

 
  @AfterTest
  public void afterTest() {
  }



  @AfterSuite
  public void afterSuite() {
  }

}
