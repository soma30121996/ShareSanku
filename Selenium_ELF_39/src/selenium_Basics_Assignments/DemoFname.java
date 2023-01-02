package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/demo.html");
		List<WebElement> name=driver.findElements(By.xpath("//input[@name='fname']"));
		for(int i=0;i<name.size();i++) {
			name.get(i).sendKeys("Somashekar N");
		}
	}

}
