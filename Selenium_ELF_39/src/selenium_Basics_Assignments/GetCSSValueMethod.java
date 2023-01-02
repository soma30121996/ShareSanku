package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//String css_value= driver.findElement(By.linkText("Register")).getCssValue("background-image");
              //System.out.println(css_value);
		//String css_value= driver.findElement(By.linkText("Register")).getCssValue("background-color");
        //System.out.println(css_value);
		System.out.println(driver.findElement(By.linkText("Register")).getCssValue("background-color"));
	}
}

