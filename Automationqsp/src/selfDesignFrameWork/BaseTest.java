package selfDesignFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConst {
	static WebDriver driver;
	public void setUp() throws IOException {
		Flib flib=new Flib();
		String browservalue = flib.readProperty(PROP_PATH, "browser");
		String url = flib.readProperty(PROP_PATH, "url");
		if (browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(url);
			
		}
		else if (browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(url);
			
		}
	}
		public void tearDown() {
			driver.quit();
	}
	

}
