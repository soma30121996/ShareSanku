	package pom_testcases;
	
	import java.io.IOException;
	
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	
	import framework_utility.Base_Test;
	import framework_utility.Utility_Methods;
	import pom_pages.DWS_HomePage;
	import pom_pages.DWS_Login_Page;
	
	
	  public class DWS_Login_Test extends Base_Test {
		  
	  @DataProvider(name="DWS_login")
		
		public Object [][] testlogin() throws IOException{
			
			Object[][] data=Utility_Methods.getTestData("Login");
			
			return data;
			
		}
		
		@Test(dataProvider="DWS_login")
		public void TC01(String UN,String Pwd) {
			
			DWS_HomePage HP= new DWS_HomePage(driver);
			HP.click_Login();
			
			DWS_Login_Page lp = new DWS_Login_Page(driver);
			lp.username(UN);
			lp.password(Pwd);
			lp.click_Login();
			
		}
		
	
	}
