package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchText {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> text =driver.findElements(By.xpath("//a"));
		
		int j=0;
		
		for(int i=0;i<=text.size();i++) {
				j=i;
		}
		System.out.println("The total number of link is : "+j);
		
		//for(int i=0;i<text.size();i++) {
			//System.out.println(text.get(i).getText());
		//}
		
		for(int i=0;i<text.size();i++) {
			String s=text.get(i).getText();
			if(s.equalsIgnoreCase("")) {
				continue;
			}
			else {
				System.out.println(s);
			}
		}
		
		driver.quit();

	}

}
