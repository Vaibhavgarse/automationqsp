package keyWordFrameDWorkAutoConst;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConst{
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib=new Flib();
		String bv = flib.readPropertiesFile(PROP_PATH, "browser");
		String bk = flib.readPropertiesFile(PROP_PATH, "key");
		String url = flib.readPropertiesFile(PROP_PATH, "url");
		
		if(bv.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(url);
		}
		else if(bv.equalsIgnoreCase("gecko"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(url);
		}
	}
	public void tearDown()
	{
		driver.quit();
	}

}
