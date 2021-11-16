package hYBRIDFRAMEWORK;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConst {
	static WebDriver driver;
	
    public void SetUp() throws IOException {
    	
    Flib flib=new Flib();
   String browservalue = flib.readPropertyFile(PROP_PATH, "browser");
   String url = flib.readPropertyFile(PROP_PATH, "url");
	
	if (browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_VALUE, CHROME_KEY);
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_VALUE, GECKO_KEY);
		driver=new FirefoxDriver();
		driver.get(url);
		
		
	}
	else
	{
		System.out.println("Enter Valid Browser Name");
	}
	
    }
    public void tearDown()
	{
		driver.quit();
		
	}
    
}
