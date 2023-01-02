package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/desktops");
		driver.findElement(By.xpath("(//h2)[1]/a")).click();
		driver.findElement(By.xpath("//input[@type='button']/preceding-sibling::script/following-sibling::input")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/books']/parent::li/a/following-sibling::div/preceding-sibling::a")).click();

	}

}
