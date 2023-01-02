package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUsingKeyboard {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		action.moveToElement(search).click().perform();
		
		//action.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.LEFT_SHIFT).sendKeys("computers").keyUp(Keys.LEFT_SHIFT).perform();


	}

}
