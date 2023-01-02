package selenium_Basics_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//WebDriverWait wait= new WebDriverWait(driver,25);
		
		driver.findElement(By.linkText("Register")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Somashekar");
		driver.findElement(By.name("LastName")).sendKeys("N");

		driver.findElement(By.name("Email")).sendKeys("tsunami147@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@type='button'])[1]"))));
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();

	}

}
