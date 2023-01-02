package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;

public class Advance_Search extends Base_Test{
	
@DataProvider(name="advancesearch")
	
	public Object[]testadvancesearch(){
		
		Object[][]data=new Object[1][5];
		
		data[0][0]= "computers";
		data[0][1]= "1000";
		data[0][2]= "90000";
		data[0][3]= "Computers";
		data[0][4]= 1;
		
		return data;
	}
	@Test(dataProvider="advancesearch")
		public void demo(String adsearch, String rangefrom, String  rangeto ,String visible_text,String index) throws InterruptedException{
		
		
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("q")), adsearch);
		Utility_Methods.Click_element(driver.findElement(By.xpath("(//input[@value='Search'])[1]")));
		Utility_Methods.Click_element(driver.findElement(By.id("As")));
		Utility_Methods.dropdown_by_Visible_text(driver.findElement(By.xpath("(//select[@name='Cid'])[1]")), visible_text);
		Utility_Methods.Click_element(driver.findElement(By.id("Isc")));
		Utility_Methods.dropdown_by_index(driver.findElement(By.xpath("(//select[@name='Mid'])[1]")), index);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.id("Pf")), rangefrom);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.id("Pt")), rangeto);
		Utility_Methods.Click_element(driver.findElement(By.id("Sid")));
		
	}
	
	
}
