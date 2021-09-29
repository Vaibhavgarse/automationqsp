package Locators;
//done
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login?__cf_chl_jschl_tk__=pmd_HfJKq1O3euNFtItgGf7.5YDAFtCNzyO8cNQTiwB4U3s-1632793793-0-gqNtZGzNAhCjcnBszQh9");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Abcd@gmail.com");
		driver.findElement(By.id("password")).sendKeys("@123");
		Thread.sleep(3000);
		driver.findElement(By.tagName("i18n-string")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginBtn")).click();

	}

}
