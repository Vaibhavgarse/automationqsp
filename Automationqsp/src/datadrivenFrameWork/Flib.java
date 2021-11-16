package datadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.zeromq.ZConfig.ReadException;

public class Flib {
	public static String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		//generic reusable method to read the data from the excel file
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
		
		
		
	}
	public int countRow(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int row = sh.getLastRowNum();
		return row;
		
		
	}
	public static  void wrightExcelData(String excelpath,String sheetname,int rowcount,int cellcount,String datavalue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(datavalue);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
		
	}
	public String readPropertiesFile(String propertyfilepath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertyfilepath);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}
}
