package selenium_Basics_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyOliveGarden {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/MultipleWindow.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
		Thread.sleep(2000);
		
		Set<String> total= driver.getWindowHandles();
		
		for(String child:total) {
			driver.switchTo().window(child);
			if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
				driver.close();
			}
			
			
		//driver.quit();
	
		}
}}