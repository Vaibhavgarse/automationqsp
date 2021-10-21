package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpthusingAxesFLipkart {

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
		driver.findElement(By.xpath("//div[@class='fMghEO']/descendant::li[@class='rgWa7D']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Men']/following-sibling::span[text()='Women']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Women']/preceding-sibling::span[text()='Men']")).click();
		

	}

}
