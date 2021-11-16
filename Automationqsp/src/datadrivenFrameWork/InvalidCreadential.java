package datadrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCreadential extends Flib  {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-rr2cfcs/login.do");
		Flib fib = new Flib();
		int rc=fib.countRow("./data/InvalidCredForActiTime.xlsx", "Invalid");
		
		for (int i=1;i<rc;i++)
		{
		String usn = readExcelData("./data/InvalidCredForActiTime.xlsx", "Invalid", i, 0);
		String pass = readExcelData("./data/InvalidCredForActiTime.xlsx", "Invalid", i, 1);
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		driver.navigate().refresh();
		driver.findElement(By.name("username")).clear();
		Thread.sleep(1000);
		}
		
		}
		

	}


