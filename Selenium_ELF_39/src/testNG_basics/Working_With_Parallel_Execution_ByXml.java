package testNG_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_Parallel_Execution_ByXml {
	
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void paralleldemo() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		
	}

}
