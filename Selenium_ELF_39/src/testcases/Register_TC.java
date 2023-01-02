package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;

public class Register_TC extends Base_Test{

@DataProvider(name="register")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Register");
		
		/*data[0][0]="Somashekar";vv
		data[0][1]="N";
		data[0][2]="soma6551@gmail.com";
		data[0][3]="soma23";
		data[0][4]="soma23";*/
		
		return data;
	}
	
	@Test(dataProvider="register")

	public void reg(String firstname, String lastname, String email, 
			String password, String confirmpassword ) {
	
		
		//driver.findElement(By.linkText("Register")).click();
		Utility_Methods.Click_element(driver.findElement(By.linkText("Register")));
		
		//driver.findElement(By.name("Gender")).click();
		Utility_Methods.Click_element(driver.findElement(By.name("Gender")));
		
		//driver.findElement(By.name("FirstName")).sendKeys(firstname);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("FirstName")), firstname);
		
		//driver.findElement(By.name("LastName")).sendKeys(lastname);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("LastName")), lastname);
		
		//driver.findElement(By.name("Email")).sendKeys(email);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("Email")), email);
		
		//driver.findElement(By.name("Password")).sendKeys(password);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("Password")), password);
		
		//driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmpassword);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("ConfirmPassword")), confirmpassword);
		
		//driver.findElement(By.id("register-button")).click();
		Utility_Methods.Click_element(driver.findElement(By.id("register-button")));
		
		//driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Utility_Methods.Click_element(driver.findElement(By.xpath("(//input[@type='button'])[1]")));
		
		
	}

}
