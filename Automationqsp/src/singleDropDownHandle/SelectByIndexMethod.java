package singleDropDownHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("file:///D:/HTML/Singleselectd.html");
	Thread.sleep(3000);
	WebElement SingleD = driver.findElement(By.xpath("//select[@name='menu']"));
	
	Select sel=new Select(SingleD);
	Thread.sleep(3000);
	sel.deselectByIndex(3);
	
	}

}
