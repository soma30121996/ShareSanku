package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MonsterIndia {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		/*WebElement  drop,skills,java;
		drop=driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"));
		skills =driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"));
		java= driver.findElement(By.xpath("(//a[@href='https://www.monsterindia.com/search/java-jobs'])[1]"));
		action.moveToElement(drop).build().perform();
		Thread.sleep(2000);
		action.moveToElement(skills).build().perform();
		Thread.sleep(2000);
		action.moveToElement(java).click().perform();
		driver.close();*/
		
		action.moveToElement(driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[@href='https://www.monsterindia.com/search/java-jobs'])[1]"))).click().perform();
		

	}

}
