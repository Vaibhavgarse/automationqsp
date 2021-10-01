package Xpath;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathforHrmlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
