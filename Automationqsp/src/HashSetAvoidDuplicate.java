import java.util.HashSet;
import java.util.List;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetAvoidDuplicate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/HTML/MultiselectD.html");
		
		
		WebElement element = driver.findElement(By.xpath("//select[@name='menu']"));
		Select sel = new Select(element);
		List<WebElement> option=sel.getOptions();
		HashSet<String> s=new HashSet<String>();
		for(int i=0;i<option.size();i++)
		{
			String DropdownOption = option.get(i).getText();
			s.add(DropdownOption);
			
		}
		for(String Vaibhav:s)
		{
			System.out.println(Vaibhav);
		}
		
	}

}
