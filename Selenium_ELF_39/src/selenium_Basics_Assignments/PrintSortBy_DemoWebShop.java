package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSortBy_DemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement books=driver.findElement(By.name("products-orderby"));
		Select sel =new Select(books);
		List<WebElement> e1 =sel.getOptions();
		for(int i=0;i<=e1.size()-1;i++) {
			System.out.println( e1.get(i).getText());
		}
		
	}
			

}
