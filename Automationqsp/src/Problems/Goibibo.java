package Problems;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Goibibo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	    WebElement element = driver.findElement(By.xpath("//input[@class='HomePageAutosuggeststyles__SearchInputStyles-sc-1v6s32j-1 euhecC']"));
	    element.sendKeys("Mysore");
	   
		

	}

}
