package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mintra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Tshirt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[.='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Tshirts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='QUANCIOUS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Rs. 575 to Rs. 647']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Green']")).click();
		
	}

}
