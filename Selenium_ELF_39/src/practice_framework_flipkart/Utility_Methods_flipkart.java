package practice_framework_flipkart;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods_flipkart {
    
   
	public static void Click_element (WebElement element ) {
		element.click();
	}
	
	public static void Enter_Value_To_Edit_Field (WebElement element,String value ) {
		element.sendKeys(value);
		}
	
	public static void dropdown_by_index(WebElement dropdown,int value) {
		Select sel = new Select(dropdown );
		sel.selectByIndex(value);	
		}
	
	public static void dropdown_by_Visible_text (WebElement dropdown,String value) {
		Select sel = new Select(dropdown );
		sel.selectByVisibleText(value);	
	}
		
    public static void dropdown_by_Value (WebElement dropdown,String value) {
		Select sel = new Select(dropdown );
		sel.selectByValue(value);
	}
    
    public static String Test_Configuration() throws IOException {
    	
    	String filepath = "./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//Creating an object for object class
				Properties prop = new Properties();
				prop.load(fis);
				String url=prop.getProperty("URL");
				return url;
    }
    
    public static Object[][] getTestData(String sheetname) throws IOException{
    	FileInputStream fis = new FileInputStream("./Test_Data/TestData_Flipkart.xlsx");
    	Workbook book = new XSSFWorkbook(fis); 
    	Sheet sheet = book.getSheet("Login");
    	
    	int rowcount = sheet.getPhysicalNumberOfRows();
    	int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
    	
    	Object data[][]=new Object[rowcount-1][colcount];
    	for(int row=1;row<=rowcount-1;row++) {
    		for(int col=0;col<=colcount-1;col++) {
    			data [row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
    		}
    	}
    	book.close();
    	
		return data;
   	
    }
   


	
}
