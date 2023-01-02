package selenium_Basics_Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemoWebShop_Books1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.findElement(By.linkText("Books")).click();
				WebElement books_select = driver.findElement(By.id("products-orderby"));
				Select books= new Select(books_select);
				
				books.selectByVisibleText("Name: Z to A");
				
				WebElement display = driver.findElement(By.name("products-pagesize"));
				Select display1= new Select(display);
				display1.selectByVisibleText("8");
				
				WebElement view = driver.findElement(By.name("products-viewmode"));
				Select view1= new Select(view);
			    view1.selectByVisibleText("List");
			    
			    driver.navigate().back();
			    
				
			}
		}
