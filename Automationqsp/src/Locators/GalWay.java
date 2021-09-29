package Locators;
//done
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GalWay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.globalglaze.in/");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm")).sendKeys("ddambhe@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("adminpassword")).sendKeys("A@123");;
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_go")).click();
		

	}

}
