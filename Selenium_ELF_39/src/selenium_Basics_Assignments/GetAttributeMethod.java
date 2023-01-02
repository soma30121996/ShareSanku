package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String attribute_value=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(attribute_value);
		
		driver.findElement(By.name("q")).sendKeys("Computer");
		String attribute_value1=driver.findElement(By.name("q")).getAttribute("value");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Somashekar N");
		String id=driver.findElement(By.name("FirstName")).getAttribute("value");
		System.out.println(attribute_value1);
		System.out.println(id);
		
		driver.quit();
		

	}

}
