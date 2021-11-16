package dynamicalytakeScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}

	public void Failed()
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			 File src = ts.getScreenshotAs(OutputType.FILE);
			 File dst = new File("./screenshot/Methodname.png");
			 Files.copy(src, dst);
		}
		catch(Exception e)
		{
			
		}
	}
}
