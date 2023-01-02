package testNG_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_Excel_Retrieve_Data {
	
@DataProvider(name="")
	
	public Object[]testdata(){
		
		Object[][]data=new Object[1][5];
		
		data[0][0]="Somashekar";
		data[0][1]="N";
		data[0][2]="soma6551@gmail.com";
		data[0][3]="soma23";
		data[0][4]="soma23";
		return data;
	}
	
	
	@Test
	public void retrieve_excel_data() throws IOException {
		FileInputStream fis= new FileInputStream("./Test_Data/TestData.xlsx");
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1"); 
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int row=1;row<rowcount;row++) {
			
			System.out.println("___________________________________________________________________");
			for(int col=0;col<colcount;col++) {
				
				System.out.print(sheet.getRow(row).getCell(col).getStringCellValue()+ "  ");
				
			}
			System.out.println("");
		}
		System.out.println("___________________________________________________________________");
		
		
	}

	
}
