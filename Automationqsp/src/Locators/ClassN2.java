package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassN2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Monica Geller",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.className("lNPNe")).click();
		//driver.findElement(By.className(className))
	}

}
