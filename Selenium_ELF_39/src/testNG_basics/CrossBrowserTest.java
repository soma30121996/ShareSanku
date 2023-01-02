package testNG_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void crossBrowserDemo(String browser) {
		
	if(browser.equalsIgnoreCase("chrome")) {
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	else {
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);}
	
	 driver.findElement(By.name("q")).sendKeys("computers");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 driver.close();
	}
	
	

}
	 


