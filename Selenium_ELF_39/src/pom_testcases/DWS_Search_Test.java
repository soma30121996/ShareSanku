package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_Search_Page;

public class DWS_Search_Test extends Base_Test {
	
	@DataProvider(name="search")
	public Object[][] Search() throws IOException{
		Object[][] data= Utility_Methods.getTestData("Search");
		return data;
	}
	
	@Test(dataProvider = "search")
	public void TC04(String vlaue) {
		DWS_Search_Page search = new DWS_Search_Page(driver);
		search.search(vlaue);
		search.click_search();
		
	}

}
