package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemoWebShop_Books {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		List<WebElement> drop=driver.findElements(By.xpath("//select[@onchange='setLocation(this.value);']"));
		
		WebElement sel;
		//Select book =new Select(sel);
		
		for(int i=0;i<drop.size();i++) {
			drop.get(i);
			
			
				
		}
		
		
	}

}
