package popupshandlingWindowsBased;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class uploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	WebElement PIM = driver.findElement(By.xpath("//b[.='PIM']"));
		Actions act=new Actions(driver);
		act.moveToElement(PIM).perform();
		driver.findElement(By.xpath("//a[.='Employee List']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@class='duplexBox']")).click();

	}

}
