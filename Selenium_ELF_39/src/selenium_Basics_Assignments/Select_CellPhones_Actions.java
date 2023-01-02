package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_CellPhones_Actions {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement electronic=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(electronic).build().perform();
		WebElement cell=driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"));
		Thread.sleep(2000);
		
		
		//THERE ARE TWO WAYS PERFORM CLICK OPERATION 
		//action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"))).click().perform();
		action.moveToElement(cell).build().perform();
		cell.click();
	
		//driver.quit();
	}
	

}
