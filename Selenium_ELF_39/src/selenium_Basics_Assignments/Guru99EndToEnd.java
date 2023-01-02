package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99EndToEnd {

	public static void main(String[] args)  throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement click=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		
		List<WebElement> multiple=driver.findElements(By.xpath("//ul/li/span"));
		
		
		for(int i=0;i<=multiple.size()-1;i++) {
			
			action.contextClick(click).perform();
			multiple.get(i).click();
			Thread.sleep(1000);
			Alert ale = driver.switchTo().alert();
			ale.accept();
			
		}
	}

}
