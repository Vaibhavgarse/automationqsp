package parallelExecutions;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecutionforclasses {
	@Test
	public void a()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("vaibhav");
	}

}
