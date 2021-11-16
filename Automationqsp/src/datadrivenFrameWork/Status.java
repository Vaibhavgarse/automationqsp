package datadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Status extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/InvalidCredForActiTime.xlsx");
		Flib flib=new Flib();
		Workbook wb = WorkbookFactory.create(fis);
		flib.wrightExcelData("./data/InvalidCredForActiTime.xlsx", "Invalid", 2, 3,"pass");
		FileOutputStream fos = new FileOutputStream("./data/InvalidCredForActiTime.xlsx");
		wb.write(fos);
		wb.close();

	}

}
