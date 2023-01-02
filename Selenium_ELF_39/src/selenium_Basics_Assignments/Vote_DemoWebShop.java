package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vote_DemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Good']")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//input[@type='button'])[2]")).getText());;

	}

}
