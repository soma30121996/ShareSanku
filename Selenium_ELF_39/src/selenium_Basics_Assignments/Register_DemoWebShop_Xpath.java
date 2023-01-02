package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_DemoWebShop_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='FirstName'])")).sendKeys("somashekar");
		driver.findElement(By.xpath("(//input[@name='LastName'])")).sendKeys("N");
		driver.findElement(By.xpath("(//input[@id='Email'])")).sendKeys("somashekar1023654@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Tsunami");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Tsunami");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.quit();
		
		
		

	}

}
