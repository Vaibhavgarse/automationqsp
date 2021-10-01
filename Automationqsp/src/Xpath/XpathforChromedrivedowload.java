package Xpath;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathforChromedrivedowload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("languages exist")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Google ChromeDriver")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("ChromeDriver 94.0.4606.61")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("chromedriver_win32.zip")).click();
		

	}

}
