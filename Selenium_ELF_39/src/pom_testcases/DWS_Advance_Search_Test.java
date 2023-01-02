package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Advanvce_SearchPage;
import pom_pages.DWS_HomePage;

public class DWS_Advance_Search_Test extends Base_Test{
	
	@DataProvider(name = "testdata")
	public Object[][]advanceserach() throws IOException{
	Object[][] data= Utility_Methods.getTestData("Advance_Search");
	return data;
	}


	@Test(dataProvider = "testdata")
	public void TC04(String value, String category_value,String manufacture_value,String from_value,String to_value) {

	DWS_HomePage hp= new DWS_HomePage ( driver );
	hp.search(value);
	hp.click_search();


	DWS_Advanvce_SearchPage as = new DWS_Advanvce_SearchPage(driver);

	as.click_advancesearch_checkbox();
	as.Click_Categorydropdown_button(category_value);
	as.Click_Manufacturerdropdown_button(manufacture_value);
	as.Enter_from_textfield(from_value);
	as.Enter_to_textfield(to_value);
	as.click_finalsearch_button();

	}
	}


