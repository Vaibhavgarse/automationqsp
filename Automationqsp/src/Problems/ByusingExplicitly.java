package Problems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ByusingExplicitly {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://desktop-rr2cfcs/login.do");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Login"));
		String LoginPageTitle=driver.getTitle();
	    if(LoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login page Condition Pass >>>");
		}
		else
		{
			System.out.println("Login page Condition Fail >>>");
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.titleContains("Enter Time-Track"));
		String HomePageTitle=driver.getTitle();
		if(HomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Home page Condition Pass >>>");
		}
		else
		{
			System.out.println("Home page Condition Fail >>>");
		}
		

	}

}
