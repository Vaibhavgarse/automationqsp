package Locators;
//done
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vaibhav");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
                                    
	}

}
