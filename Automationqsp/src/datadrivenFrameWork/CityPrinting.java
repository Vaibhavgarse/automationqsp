package datadrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CityPrinting extends Flib{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		int j=0;
		System.out.println("Name Of The City Is:");
		for (int i=1;i<=10;i++)
		{
			
		String City = readExcelData("./data/Cityname.xlsx", "City", i, j);
		
		System.out.println(City);
		}
		
	}
}