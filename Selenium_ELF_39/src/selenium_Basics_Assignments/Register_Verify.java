package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String expectedresult="Your registration completed";
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Somashekar N");
		driver.findElement(By.id("LastName")).sendKeys("N");
		driver.findElement(By.name("Email")).sendKeys("somashekar201.n1996@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("TsunamiSoma");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("TsunamiSoma");
		driver.findElement(By.id("register-button")).click();
		String Actualresult=driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
		System.out.println(Actualresult);
		
		if(expectedresult.equals(Actualresult)) {
			System.out.println("message displayed successfully");
			
		}
		else {
			System.out.println("not displayed");
		}

	}

}
