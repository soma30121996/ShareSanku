package testcases;

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

public class Search_TC extends Base_Test {
	

@DataProvider(name="search")
		public Object[]testsearch(){
		Object[][]data=new Object[1][1];
		data[0][0]="computers";
		return data;
	}

	@Test(dataProvider="search")
	public void demo(String value) throws InterruptedException {
		//driver.findElement(By.name("q")).sendKeys(value);
		Utility_Methods.Enter_Value_To_Edit_Field(driver.findElement(By.name("q")), value);
		
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		Utility_Methods.Click_element(driver.findElement(By.xpath("//input[@value='Search']")));
		Thread.sleep(1000);
	}}
