package testNG_basics;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class Retrieve_Excel_Data_Using_Data_Provider  {
	
  @Test
	public void retrieve() throws IOException {
		
	FileInputStream fis = new FileInputStream("./Test_Data/TestData.xlsx");
	
	 Workbook book = new XSSFWorkbook(fis);
	 Sheet sheet = book.getSheet("Sheet1");
	 
	 int rowcount = sheet.getPhysicalNumberOfRows();
	 int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
	 
	 Object[][]data=new Object[rowcount-1][colcount];
	 
	 for(int i=0;i<=rowcount-1;rowcount++) {
		 
	 }
	 
  }
}
		
	 
	 
	
	
	

