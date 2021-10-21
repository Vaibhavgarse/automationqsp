package Xpath;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsMethodUsingForEach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Lion");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(WebElement we:suggestion)
		{
		String suggestions = we.getText();
		System.out.println(suggestions);
		
		}

	}

}
