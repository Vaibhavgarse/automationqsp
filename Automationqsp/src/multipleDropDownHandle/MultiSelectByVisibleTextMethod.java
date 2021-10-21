package multipleDropDownHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MultiSelectByVisibleTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/HTML/MultiselectD.html");
		WebElement option = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel=new Select(option);
	
			sel.selectByVisibleText("kachori");
			sel.selectByVisibleText("Poha");
			sel.selectByVisibleText("Vadapao");
		
		
		

	}

}
