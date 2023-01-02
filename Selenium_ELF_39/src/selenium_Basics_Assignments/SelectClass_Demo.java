package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Demo {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/demo.html");
		WebElement select_car= driver.findElement(By.id("standard_cars"));
		Select sel = new Select(select_car);
		sel.selectByValue("bmw");
		Thread.sleep(1000);
		sel.selectByIndex(9);
		Thread.sleep(1000);
		sel.selectByVisibleText("Honda");
		Thread.sleep(1000);
	}

}