package fram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameElement {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/HTML/New%20folder/username.html");
			driver.manage().window().maximize();
		
		driver.findElement(By.id("un")).sendKeys("Vaibhav");
		WebElement frameElement = driver.findElement(By.id("frid"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("pwd")).sendKeys("Vaibhav");
	}

}
