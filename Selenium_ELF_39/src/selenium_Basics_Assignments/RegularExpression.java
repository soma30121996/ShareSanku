package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//span[contains(@class,'cart-label')])[1]")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Welcome')]")).getText());
	}

}
