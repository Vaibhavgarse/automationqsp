package parameterstsetngAssignmentCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parameters {
   @org.testng.annotations.Parameters("browservalue")
  @Test
  
  public void lounchTheChromeBrowser(String browservalue, String usn, String pass) throws InterruptedException {
	   if (browservalue.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		   driver.get("https://www.calculator.net/");
		   driver.switchTo().activeElement().sendKeys("Its Chrome bro");
		   Thread.sleep(2000);
		  
		  
	   }
	   else if (browservalue.equalsIgnoreCase("firefox"))
	   {
		   System.setProperty("webdriver.gicko.driver", "./drivers/gickodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.calculator.net/");
		   driver.switchTo().activeElement().sendKeys("Its firefox bro");
		   Thread.sleep(2000);
		   
	   }
	   else
	   {
		   Reporter.log("Enter Valid Value",true);
	   }
  }
}
