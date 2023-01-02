package selenium_Basics_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiple_Windows {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String parent_window = driver.getWindowHandle();
		
		WebElement s1=driver.findElement(By.linkText("Facebook"));
		s1.click();
		
		//Handling Multiple windows
		
		Set<String> total_windows =driver.getWindowHandles();
		String child =driver.getWindowHandle();
		
		System.out.println(parent_window);
		System.out.println(child);
		
		for(String child_window : total_windows ) {
			
			System.out.println(child_window);
			
			driver.switchTo().window(child_window);
			
			//to print the tittle
			System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.findElement(By.name("email")).sendKeys("soma@gmail.com");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent_window)	;
		driver.quit();
		
		
		

	}

}
