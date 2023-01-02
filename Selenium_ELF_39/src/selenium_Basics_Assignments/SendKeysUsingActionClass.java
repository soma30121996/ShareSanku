package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysUsingActionClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions action = new Actions(driver);
		
		WebElement search =driver.findElement(By.name("q"));
		action.moveToElement(search).click().sendKeys("mobiles").perform();
		//action.sendKeys(search, "Computers").perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
	

}
}