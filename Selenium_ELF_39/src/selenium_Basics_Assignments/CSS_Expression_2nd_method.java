package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Expression_2nd_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("Computer");
		driver.quit();
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Computer");
		//driver.quit();
	}

}
