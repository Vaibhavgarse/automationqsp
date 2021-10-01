package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextfild {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase font-weight-bold' or @class='selenium-button selenium-ide text-uppercase font-weight-bold' or @class='selenium-button selenium-grid text-uppercase font-weight-bold']")).click();;
	//multiple path selection using xpath;
		
	}

}
