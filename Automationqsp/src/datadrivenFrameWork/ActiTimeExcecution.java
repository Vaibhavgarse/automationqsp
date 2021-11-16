package datadrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeExcecution {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://desktop-rr2cfcs/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Flib fib=new Flib();
		String Username = fib.readExcelData("./Data/Testdata.xlsx", "ActiTime", 1, 0);
		String password = fib.readExcelData("./Data/Testdata.xlsx", "ActiTime", 1, 1);
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement btn = driver.findElement(By.id("loginButton"));
	
		usn.sendKeys(Username);
		pass.sendKeys(password);
		btn.click();
		

	}

	

}
