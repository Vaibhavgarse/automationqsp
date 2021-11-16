package keyWordDrivenFrameWork;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver; 
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		 String bv = flib.readPropertiesFile("./data/Config.properties", "browser");
		String bk = flib.readPropertiesFile("./data/Config.properties", "key");
		String url = flib.readPropertiesFile("./data/Config.properties", "url");
		
		if(bv.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	
		}
		else if (bv.equals("firefox"))
		
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
		}
		
	}
	public void tearDown()
	{
		driver.quit();
	}

}
