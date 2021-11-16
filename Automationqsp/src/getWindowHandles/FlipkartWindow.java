package getWindowHandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartWindow {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@class='_4rR01T' and .='SAMSUNG Galaxy F12 (Celestial Black, 64 GB)']")).click();
		
		
	}
}