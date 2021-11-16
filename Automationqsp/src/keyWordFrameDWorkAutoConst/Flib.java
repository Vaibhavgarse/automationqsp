package keyWordFrameDWorkAutoConst;

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

public class Flib{
	public String readExcelData(String exelpath, String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException{
	FileInputStream fis = new FileInputStream(exelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row row = sh.getRow(rowcount);
	Cell cell = row.getCell(cellcount);
	String data = cell.getStringCellValue();
	return data;
	
	}
	public static void wrightExcelFile(String exelpath, String sheetname,int rowcount,int cellcount,String datavalue) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(exelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(datavalue);
		FileOutputStream fos=new FileOutputStream(exelpath);
		wb.write(fos);
		wb.close();
		}
	public int countRow(String exelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(exelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int row = sh.getLastRowNum();
		return row;
	}
	public String readPropertiesFile(String key,String proppath) throws IOException {
		FileInputStream fis=new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}

}
