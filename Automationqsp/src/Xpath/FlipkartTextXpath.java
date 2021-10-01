package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartTextXpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']]")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile",Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='_3879cV' and .='6 GB & Above']")).click();

	}

}
