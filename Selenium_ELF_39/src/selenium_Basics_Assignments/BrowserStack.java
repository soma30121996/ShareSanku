package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStack {

	public static void main(String[] args)  throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.id("user_full_name")).sendKeys("Somashekar");
		driver.findElement(By.id("user_email_login")).sendKeys("business@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.id("tnc_checkbox")).click();
		driver.findElement(By.name("commit")).click();
		

	}

}
