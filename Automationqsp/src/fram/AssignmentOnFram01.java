package fram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnFram01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@allow='autoplay;']"));
	
	driver.switchTo().frame(frameElement);
	
	driver.findElement(By.xpath("//p[@class='lc-9blymn e16i86ec0']")).click();
	driver.findElement(By.id("name")).sendKeys("Vaibhav Garse");
	
	driver.findElement(By.id("email")).sendKeys("vaibhavgarse0512@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("940149425");
	
	 

}
}
