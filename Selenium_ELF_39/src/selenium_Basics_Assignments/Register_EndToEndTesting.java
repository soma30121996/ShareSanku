package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_EndToEndTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Somashekar N");
		driver.findElement(By.id("LastName")).sendKeys("N");
		driver.findElement(By.name("Email")).sendKeys("somashekar1.n1996@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("TsunamiSoma");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("TsunamiSoma");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		driver.quit();

	}

}
