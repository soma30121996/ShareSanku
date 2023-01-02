package testNG_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_With_Assertion {
	
	@Test
	public void AssertionDemo() {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "Demo Web Shop");
		 
		 driver.findElement(By.name("q")).sendKeys("computers");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 String text=driver.findElement(By.xpath("//input[@id='Q']")).getAttribute("value");
		 Assert.assertEquals(text, "computers");
		 
		 driver.close();
	} 

}
