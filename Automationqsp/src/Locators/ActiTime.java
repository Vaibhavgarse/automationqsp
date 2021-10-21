package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://desktop-rr2cfcs/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.tagName("")).sendKeys("Abcd@gmail.com");
		driver.findElement(By.name("")).sendKeys("@123");
		driver.findElement(By.id("")).click();
		driver.findElement(By.tagName("")).click();

	}

}
