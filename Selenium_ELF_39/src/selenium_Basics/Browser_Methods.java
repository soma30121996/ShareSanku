package selenium_Basics;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser_Methods {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//Launch Chrome driver
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://mail.google.com/mail/");
		driver.get("https://www.irctc.co.in/");
		
		//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		//WebDriver driver1= new FirefoxDriver();
		//driver1.close();
	}
}