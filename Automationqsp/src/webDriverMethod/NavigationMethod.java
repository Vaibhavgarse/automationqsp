package webDriverMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("DHinchak Pooja",Keys.ENTER);
		Thread.sleep(3000);
		Navigation nav = driver.navigate();
		//driver.navigate().back();
		nav.back();
		Thread.sleep(3000);
		
		//driver.navigate().forward();
		nav.forward();
		Thread.sleep(3000);
		//driver.navigate().refresh();
		nav.refresh();
		driver.close();
		

	}

}
