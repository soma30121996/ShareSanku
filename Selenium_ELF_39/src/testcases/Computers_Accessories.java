package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework_utility.Base_Test;
import framework_utility.Utility_Methods;

public class Computers_Accessories  extends Base_Test{
	

	@Test
	void accessories() {
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//li/a)[6]"))).perform();
		WebElement click=driver.findElement(By.xpath("(//li/a[@href='/accessories'])[1]"));
		Utility_Methods.Click_element(click);
		
	}
	

}
