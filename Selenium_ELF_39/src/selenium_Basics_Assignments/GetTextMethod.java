package selenium_Basics_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.name("q")).sendKeys("computer");
	    String Search_textfield_text=driver.findElement(By.name("q")).getText();
	    String LoginText = driver.findElement(By.className("ico-login")).getText();
	    String JeweleryLink_text= driver.findElement(By.linkText("Jewelry")).getText();
	  //  String SerchButtonText =driver.findElement(By.tagName("input"))
		//System.out.println(c);
	   String d= driver.findElement(By.className("search-box")).getText();
	   System.out.println(d+"hi maga");
		driver.quit();

	}

}
