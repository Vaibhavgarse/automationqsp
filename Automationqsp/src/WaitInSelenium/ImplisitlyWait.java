package WaitInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplisitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
	
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
	
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Core i5')])[1]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Brand')])[1]")).click();;						
		driver.findElement(By.xpath("(//div[contains(text(),'DELL')])[1]")).click();

		driver.findElement(By.xpath("(//div[contains(.,'Customer Ratings')])[10]")).click();


		driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]")).click();
	}

}
