package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Books_Page;
import pom_pages.DWS_HomePage;


public class DWS_Books_Test extends Base_Test{

	@DataProvider(name="books")
    public Object [][] test_books() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Books");
		
		return data;
		
	}
	
	@Test(dataProvider= "books")
	public void TC03(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.click_Books();
	
		DWS_Books_Page  book = new DWS_Books_Page(driver);
		book.sortby(sortby);
		book.display_dropdown(display);
		book.View_as(viewas);
		
		book.click_prduct();
		book.addTo_Cart_btn();
		
		
	}
	

}
