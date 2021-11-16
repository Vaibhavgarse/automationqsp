package takeScreenShortManualy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;
//ScreenShot Using Down Casting
public class TakeScreenShot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/Image2.png");
		Files.copy(src, dst);
		

	}

}
