package multipleDropDownHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class  DeselectAllMethod{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/HTML/MultiselectD.html");
		Thread.sleep(8000);
		
		
		WebElement element = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel = new Select(element);
		for(int i=0;i<=5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
			
		}
		
	    sel.deselectAll();
		
	}
}