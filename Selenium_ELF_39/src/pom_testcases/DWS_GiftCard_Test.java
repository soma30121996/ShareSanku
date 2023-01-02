package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_GiftCard_Page;
import pom_pages.DWS_HomePage;



public class DWS_GiftCard_Test  extends Base_Test {
	
	@DataProvider(name = "DWS_GiftCard")
	
	public Object [][] testtest_Gift_Card() throws IOException{
			
			Object[][] data=Utility_Methods.getTestData("Gift_Card");
			
			return data;
		}
		
		
	@Test(dataProvider= "DWS_GiftCard")
	public void TC03(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.click_GiftCard();
		
		DWS_GiftCard_Page  gift = new DWS_GiftCard_Page(driver);
		gift.sortby(sortby);
		gift.display_dropdown(display);
		gift.View_as(viewas);
		
		gift.click_prduct();
		gift.addTo_Cart_btn();
		
		
	}
	

}
