package selenium_Basics_Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Alerts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double_click =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(double_click).perform();
		Thread.sleep(1000);
		
		Alert ale = driver.switchTo().alert();
		
		ale.accept();
		

	}

}
