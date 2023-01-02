package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Digital_Downloads_Page;
import pom_pages.DWS_HomePage;

public class DWS_Digital_Downloads_Test extends Base_Test{
	
	@DataProvider(name="DWS_Digital_Downloads")
    public Object [][] testDigitalDownloads() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Digital_Downloads");
		
		return data;
		
	}
	
	@Test(dataProvider= "DWS_Digital_Downloads")
	public void TC03(String sortby,String display,String viewas) {
		
		DWS_HomePage hp= new DWS_HomePage(driver);
		hp.click_digital_downloads();
		
		DWS_Digital_Downloads_Page ddp = new DWS_Digital_Downloads_Page(driver);
		ddp.sortby(sortby);
		ddp.display_dropdown(display);
		ddp.View_as(viewas);
		ddp.addTo_Cart_btn();
		
		
	}

}
