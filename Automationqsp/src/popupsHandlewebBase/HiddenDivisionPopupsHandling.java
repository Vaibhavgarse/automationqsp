package popupsHandlewebBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HiddenDivisionPopupsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900')]")).click();
		driver.findElement(By.xpath("(//div[.='27' and contains(@class,'day')])[1]")).click();
	
	}
}