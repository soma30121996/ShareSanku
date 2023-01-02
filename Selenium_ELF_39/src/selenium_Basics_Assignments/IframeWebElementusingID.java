package selenium_Basics_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWebElementusingID {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Identify frame and switch to it 
		
		//Switch to frame by web element using ID
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		
		driver.findElement(By.name("txt_lg_search")).sendKeys("Books");
		
	}

}
