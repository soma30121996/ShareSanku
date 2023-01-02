package pom_testcases;

import org.testng.annotations.Test;

import framework_utility.Base_Test;
import pom_pages.DWS_HomePage;


public class DWS_Wishlist_Test extends Base_Test {
	@Test
	public void TC05() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_Wishlist();
		
	}

}
