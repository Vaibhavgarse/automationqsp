package popupsHandlewebBase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupsHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vaibhav%20Garse/Desktop/HTML/AlertPopups.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(5000);
		
		Alert al = driver.switchTo().alert();
		String textOfAlertPopup = al.getText();
		System.out.println(textOfAlertPopup);
		//al.accept();
		al.dismiss();//both work same becouse thire is only one button
	}

}