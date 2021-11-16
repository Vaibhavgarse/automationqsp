package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.getTheRowCount(EXCEL_PATH, "Invalid");
		for(int i=1;i<=rc;i++)
		{
			String Iusername = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			String Ipassword = flib.readExcelData(EXCEL_PATH, "Invalid", i, 1);
			lp.actiTimeLoginInvalid(Iusername, Ipassword);
		}
		bt.tearDown();

	}

}
