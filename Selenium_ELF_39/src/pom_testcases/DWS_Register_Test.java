package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_Login_Page;
import pom_pages.DWS_Register_Page;

public class DWS_Register_Test extends Base_Test {
	
	@DataProvider(name = "DWS_Register")
	
public Object [][] testRegister() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Register");
		
		return data;
	}
	
	
	@Test(dataProvider= "DWS_Register")
	
public void TC02(String FN,String LN,String email,String password , String cnfm_password) {
		
		DWS_HomePage HP= new DWS_HomePage(driver);
		HP.click_Reg();
		
		DWS_Register_Page rp = new DWS_Register_Page(driver);
		rp.click_Radio_Male();
		
		rp.firstName(FN);
		rp.lastName(LN);
		rp.email(email);
		rp.password(password);
		rp.confirm_Password(cnfm_password);
		rp.click_Register();
		
		
		
	}

}
