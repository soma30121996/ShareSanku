package testNG_basics;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_With_Excel {
	
	@Test
	public void exceldemo() throws IOException {
		
		
		String file_path ="./Test_Data/TestData.xlsx";
		
		FileInputStream fis = new FileInputStream(file_path);
		
		//Create Object for excel file
		Workbook book = new XSSFWorkbook(fis);
		
		//Access the Sheet
		Sheet sheet  =book.getSheet("Sheet1");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		//Access the row and cell
		//String value = sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		
	//	Object[][] data=new Object[rowcount][colcount];
		
	//	System.out.println(rowcount);
		//System.out.println(colcount);
		
		
		
		for(int i=0;i<=rowcount;i++) {
			for(int j=0;j<=colcount;j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
		
		
		/*System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());*/
		
		
		
	}

}
