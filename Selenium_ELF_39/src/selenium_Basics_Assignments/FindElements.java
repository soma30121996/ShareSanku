package selenium_Basics_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> button=driver.findElements(By.xpath("//input[@type='button']"));
	
	for(int i=0;i<button.size()-1;i++) {
		System.out.println(button.get(i).getText()+"hi maga");
		
	}
	for(int i=0;i<button.size();i++) {
		System.out.println(button.get(i).getAttribute("value"));	
	}
	for(int i=0;i<button.size()-1;i++) {
		System.out.println(button.get(i));}
	}
}
