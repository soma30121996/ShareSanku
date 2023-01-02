package pom_testcases;

import org.testng.annotations.Test;

import framework_utility.Base_Test;
import pom_pages.DWS_Vote_Page;


public class DWS_Vote_Test extends Base_Test{
	
	@Test
	public void DWS_vote() {
		DWS_Vote_Page vp= new  DWS_Vote_Page(driver);

		
		vp.voteradio();
		vp.Click_vote();
		
	}

}
