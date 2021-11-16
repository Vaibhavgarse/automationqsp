package parallelExecutions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestblockExecutionParralely {
	WebDriver driver;
	@Parameters({"usn","pwd","browser"})
	@Test
	public void Execution(String un,String pass,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://desktop-rr2cfcs/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
	
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://desktop-rr2cfcs/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
	}
	

}
