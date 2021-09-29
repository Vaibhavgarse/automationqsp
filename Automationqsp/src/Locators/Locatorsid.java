package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsid {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://poshanabhiyaan.gov.in/#/login");
		driver.findElement(By.id("mat-input-0")).sendKeys("mow&cd-2751005");
		driver.findElement(By.id("mat-input-1")).sendKeys("mow&cd-2751005");
		driver.findElement(By.id("signin")).click();
		
	}
	

}
