package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_ClickMethod {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> radio =driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<=radio.size()-1;i++) {
			radio.get(i).click();
			Thread.sleep(1000);
		}
		driver.quit();

	}

}
