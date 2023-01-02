package selenium_Basics_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW_fb_demowebshop {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String a=driver.getTitle();
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Facebook")).click();
		
		Set<String> total_Windows = driver.getWindowHandles();
		
		for(String child_window : total_Windows) {

			driver.switchTo().window(child_window);
           
			
			if(driver.getTitle().equalsIgnoreCase(a)) {
				continue;
			}
			else {
				driver.close();
			}
			
		}
			driver.switchTo().window(parent);
			driver.findElement(By.name("q")).sendKeys("Mobiles");
		
		

	}

}
