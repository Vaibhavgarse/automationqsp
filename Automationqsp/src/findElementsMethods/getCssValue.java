package findElementsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.instagram.com/accounts/login/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("input[class='_2hvTZ pexuQ zyHYP']")).sendKeys("abcdef@gmail.com");
			driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("2222000");
			WebElement Bt =driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L')]"));
			String ButtonBt=Bt.getCssValue("background-color");// it is used to get Css Attribute 
			System.out.println(ButtonBt);
	      Bt.click();


	}

}
