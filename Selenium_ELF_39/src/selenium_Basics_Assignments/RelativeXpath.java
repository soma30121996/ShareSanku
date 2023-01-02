package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/xpath1.html");
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("Somashekar");
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("N");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("TYSS");
	driver.quit();
	}

}
