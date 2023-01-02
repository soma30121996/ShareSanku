package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Electronics_Page;
import pom_pages.DWS_HomePage;

public class DWS_Electronics_Test extends Base_Test{
	
	@DataProvider(name="Electronics")
    public Object [][] test_Electronics() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Electronics");
		
		return data;
		
	}
	
	@Test(dataProvider= "Electronics")
	public void TC03(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.click_Electronics();
		
		DWS_Electronics_Page  elect = new DWS_Electronics_Page(driver);
		elect.click_prduct();
		elect.sortby(sortby);
		elect.display_dropdown(display);
		elect.View_as(viewas);
		
		
		
	}
	

}
