package keyWordFrameDWorkAutoConst;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidACTItime extends BaseTest implements IAutoConst {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		
		Flib flib=new Flib();
		int rc = flib.countRow(EXCEL_PATH, "Invalid");
		for (int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "Invalid", i, 1);
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
