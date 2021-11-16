package hYBRIDFRAMEWORK;

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
	public int getRowCount(String EXCEL_PATH,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int row = sh.getLastRowNum();
		return row;
	}
	public String readPropertyFile(String PROP_PATH,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(PROP_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	public String readExcelCount(String EXCEL_PATH,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}
	public void writeExceldata(String EXCEL_PATH,String sheetname,int rowcount,int cellvalue,String datavalue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellvalue);
		cell.setCellValue(datavalue);
		FileOutputStream fos = new  FileOutputStream(EXCEL_PATH);
		wb.write(fos);
		wb.close();
	}
	

}
