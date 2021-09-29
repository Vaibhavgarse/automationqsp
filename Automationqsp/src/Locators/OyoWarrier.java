package Locators;
//done
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OyoWarrier {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://oyemobile.fibrehub.com/Login.aspx");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("cphBody_txtUserName")).sendKeys("Abcd@gmail.com");
		driver.findElement(By.id("cphBody_txtPassword")).sendKeys("@123");
		Thread.sleep(3000);
		driver.findElement(By.id("cphBody_chkRememberMe")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cphBody_btnLogin")).click();

	}


}
