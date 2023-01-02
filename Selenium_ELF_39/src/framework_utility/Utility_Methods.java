package framework_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods {
    
   
	public static void Click_element (WebElement element ) {
		element.click();
	}
	
	public static void Enter_Value_To_Edit_Field (WebElement element,String value ) {
		element.sendKeys(value);
		}
	
	public static void dropdown_by_index(WebElement dropdown,String index) {
		Select sel = new Select(dropdown );
		int a=Integer.parseInt(index);
		sel.selectByIndex(a);	
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
    	
    	String filepath ="./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//Creating an object for object class
				Properties prop = new Properties();
				prop.load(fis);
				String url=prop.getProperty("URL");
				return url;
    }
    
    public static Object[][] getTestData(String sheetname) throws IOException{
    	FileInputStream fis = new FileInputStream("./Test_Data/TestData.xlsx");
    	Workbook book = new XSSFWorkbook(fis); 
    	Sheet sheet = book.getSheet(sheetname);
    	
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
    
    public static Actions action(WebDriver driver, WebElement element) {
    	Actions action = new Actions(driver);
    	action.moveToElement(element).build().perform();
    	
    	return action;
    	
    }
    
    public void multiple_parent_window(WebDriver driver) { 
    	String parent =driver.getWindowHandle();
    	}
    
    public void multiple_child_window(WebDriver driver,WebElement element,String title_of_window ) {
    	
    	Set<String> total=driver.getWindowHandles();
    	for(String child : total) {
    		driver.switchTo().window(child);
    		if (driver.getTitle().equalsIgnoreCase(title_of_window)) {
    			action( driver,  element);
    		}
    	}
    	
    }
    
    
    
}
   


	

