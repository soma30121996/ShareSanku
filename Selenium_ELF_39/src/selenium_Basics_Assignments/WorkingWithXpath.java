package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/TYSS/Selenium/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Somashekar");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("N");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TYSS");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bengaluru");
		System.out.print(" '' ");
		
		
	}

}
