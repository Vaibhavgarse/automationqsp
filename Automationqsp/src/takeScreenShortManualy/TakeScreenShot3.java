package takeScreenShortManualy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShot3 {
//Screen Shot USing RemoteWebDriver
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver rdriver=new ChromeDriver();
		rdriver.get("https://www.google.com/");
		File src = rdriver.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/Image3.png");
		Files.copy(src, dst);
		
		

	}

}
