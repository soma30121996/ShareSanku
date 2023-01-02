package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Login {

	public static void main(String[] args) {
		
		String UN="somashekar.n1996@gmail.com";
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("somashekar.n1996@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("TsunamiSoma");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		String actual=driver.findElement(By.className("account")).getText();
		if(UN.equalsIgnoreCase(actual)) {
			System.out.println("The user Id is right");
		}
		else {
			System.out.println("The user Id is wrong");
		}
		driver.quit();

	}

}
