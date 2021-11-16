package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidActiTimeLoginFrameWork extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib=new Flib();

		int rc = flib.countRow("./data/InvalidCredForActiTime1.xlsx", "Invalid");
		for (int i=1;i<=rc;i++)
		{
			String username = Flib.readExcelData("./Data/InvalidCredForActiTime1.xlsx", "Invalid", i, 0);
			String password = Flib.readExcelData("./Data/InvalidCredForActiTime1.xlsx", "Invalid", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);
		}
		bt.tearDown();
	}

}
