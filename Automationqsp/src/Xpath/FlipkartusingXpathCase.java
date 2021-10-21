package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartusingXpathCase {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Core i5')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'Brand')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[contains(text(),'DELL')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(@class,'_2gmUFU _3V8rao')]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]")).click();
	}

}
