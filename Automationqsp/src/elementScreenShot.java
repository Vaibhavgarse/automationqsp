import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class elementScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/Image5.png");
		Files.copy(src, dst);

	}

}
