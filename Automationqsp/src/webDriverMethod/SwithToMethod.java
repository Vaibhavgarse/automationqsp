package webDriverMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithToMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Vaibhav",Keys.ENTER);
		

	}

}
