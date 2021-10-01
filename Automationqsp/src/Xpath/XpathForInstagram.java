package Xpath;
//using css selector
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_2hvTZ pexuQ zyHYP']")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("2222000");
		driver.findElement(By.xpath("//div[@class='            qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']")).click();
		

	}

}
