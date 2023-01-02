package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Facebook_Multiple_Window_Page;
import pom_pages.DWS_HomePage;

public class DWS_Facebook_Multiple_Window_Test extends Base_Test {
	
	@DataProvider(name="multihandlepom")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_Methods.getTestData("multihandle");
		return data;
	}
	
	@Test(dataProvider = "multihandlepom")
	public void Tc12(String val1,String val2) {
		DWS_Facebook_Multiple_Window_Page mhp=new DWS_Facebook_Multiple_Window_Page(driver);
		mhp.parent(driver);
		
		DWS_HomePage hp=new DWS_HomePage(driver);
	//	hp.page_down();
	//	hp.page_down();
		hp.click_facebook();
		
		
	
	

	 // mhp.Click_mail(val1);
	  //mhp.Click_password_fb(val2);
	  //mhp.Click_btn_ffb();

}
	

}
