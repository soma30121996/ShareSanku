package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Apparel_And_Shoes_Page;
import pom_pages.DWS_HomePage;


public class DWS_Apparel_And_Shoes_Test extends Base_Test{

	@DataProvider(name="DWS_Apparel_And_Shoes")
    public Object [][] test_AASPellery() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Apparel_And_Shoes");
		
		return data;
		
	}
	
	@Test(dataProvider= "DWS_Apparel_And_Shoes")
	public void TC03(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.click_Apparel_And_Shoes();
		
		DWS_Apparel_And_Shoes_Page  AASP = new DWS_Apparel_And_Shoes_Page(driver);
		AASP.sortby(sortby);
		AASP.display_dropdown(display);
		AASP.View_as(viewas);
		AASP.click_next();
		
		AASP.click_prduct();
		AASP.addTo_Cart_btn();
		
		
	}
}
