package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_MouseHover {

	public static void main(String[] args)throws Throwable  {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computers=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		Actions a1 =new Actions(driver);
		a1.moveToElement(computers).build().perform();
		//a1.m
		Thread.sleep(2000);
		driver.quit();

	}

}
