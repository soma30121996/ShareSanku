package selenium_Basics_Assignments;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Robot_Class {

	public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/demo.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Actions action = new Actions(driver);
			WebElement button = driver.findElement(By.id("resume"));
			action.click(button).build().perform();
			Thread.sleep(2000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);
			
			for(int i=0;i<=2;i++) {
				Thread.sleep(1500);
				robot.keyPress(KeyEvent.VK_TAB);
			}
			
			robot.keyPress(KeyEvent.VK_ENTER);
			driver.quit();

	}

}
