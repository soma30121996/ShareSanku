package selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

      WebDriver driver= new ChromeDriver();
		
	    driver.get("https://mail.google.com/mail/");
		driver.get("https://www.irctc.co.in/");
	}

}
