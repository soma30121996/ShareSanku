package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;

public class Login_TC extends Base_Test {
	
@DataProvider(name="login")
	
	public Object[]testlog() throws IOException{
	
	Object[][]data =Utility_Methods.getTestData("Login");
		
		return data;
	}

	@Test(dataProvider="login")
		public void Login(String Email, String Password) {
		
		//driver.findElement(By.linkText("Log in")).click();
		WebElement login=driver.findElement(By.linkText("Log in"));
		Utility_Methods.Click_element(login);
		
		WebElement email=driver.findElement(By.id("Email"));
		//driver.findElement(By.id("Email")).sendKeys("soma6521@gmail.com");		
		Utility_Methods.Enter_Value_To_Edit_Field(email, Email);
		
		//driver.findElement(By.id("Password")).sendKeys("soma23");
		WebElement password =driver.findElement(By.id("Password"));
		Utility_Methods.Enter_Value_To_Edit_Field(password, Password);
		
		WebElement Click=driver.findElement(By.xpath("//input[@value='Log in']"));
		Utility_Methods.Click_element(Click);
		
		Utility_Methods.Click_element(driver.findElement(By.linkText("Log out")))	;
	
		}
		
	

}
