package Problems;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_01_ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://desktop-rr2cfcs/login.do");
		Thread.sleep(3000);
		String LoginPageTitle=driver.getTitle();
		System.out.println(LoginPageTitle);
	
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
		Thread.sleep(3000);
		String HomePageTitle=driver.getTitle();
		System.out.println(HomePageTitle);
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
