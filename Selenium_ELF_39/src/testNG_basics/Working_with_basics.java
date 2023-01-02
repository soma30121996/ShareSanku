package testNG_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_basics {
	//If atleast one test
	@Test
	//In TestNG The methods will be considered as "Test case"
	public void Demo() {
		System.out.println("From today onwards we will learn TestNG");
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to TestNG ");
		//In TestNG The code which is written inside methods will be considered as "Test Steps"
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.quit();
		
	}

}
