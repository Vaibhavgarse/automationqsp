package multipleDropDownHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/HTML/MultiselectD.html");
		Thread.sleep(3000);
		WebElement SingleD = driver.findElement(By.xpath("//select[@name='menu']"));
		
		Select sel=new Select(SingleD);
		for (int i=0;i<4;i++)
		{
			 sel.selectByIndex(i);
			
			Thread.sleep(2000);
			System.out.println(i);
		
		}

	}

}
