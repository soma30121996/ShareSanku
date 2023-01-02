package testNG_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_With_Parameters {
	
	
	@Test
	@Parameters({"URL","product"})
	public void paralleldemo(String my_url,String value) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		driver.get(my_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys(value);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		
	}

}
