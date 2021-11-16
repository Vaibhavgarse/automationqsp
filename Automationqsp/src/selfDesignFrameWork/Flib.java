package selfDesignFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public void wrightExcelFileData(String EXCEL_PATH,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		 Cell cell = row.createCell(cellcount);
		 cell.setCellValue(data);
		 FileOutputStream fos = new FileOutputStream(EXCEL_PATH);
		 wb.write(fos);
		 wb.close();
		}
	public int getTheRowCount(String EXCEL_PATH,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet(sheetname);
				int row = sh.getLastRowNum();
				
				return row;
				
	}
	public String readExcelData(String EXCEL_PATH,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetname);
		 Row row = sh.getRow(rowcount);
		 Cell cell = row.getCell(cellcount);
		 String data = cell.getStringCellValue();
		 return data;
		
	}
	public String readProperty(String PROP_PATH,String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(PROP_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;
	}

	
}
