package Flipkart_Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Utility_Methods;
import practice_framework_flipkart.Base_Test_flipkart;
import practice_framework_flipkart.Utility_Methods_flipkart;

public class _1_Login_Flipkart extends Base_Test_flipkart{


@DataProvider(name="login")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Login");
	
		return data;
}
@Test(dataProvider="login")

public void log(String Mobile_number, String password ) {
	
	
	Utility_Methods_flipkart.Click_element(driver.findElement(By.xpath("//div[@class='_2QfC02']/button")));
	
	Utility_Methods_flipkart.Click_element(driver.findElement(By.className("_1_3w1N")));
	
	Utility_Methods_flipkart.Enter_Value_To_Edit_Field(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")), Mobile_number);
	
	Utility_Methods_flipkart.Enter_Value_To_Edit_Field(driver.findElement(By.xpath("//input[@type='password']")), password);
	
	Utility_Methods_flipkart.Click_element(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
}
}
