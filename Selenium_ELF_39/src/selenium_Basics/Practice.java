package selenium_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args)  {
		int max=0;
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> mytable = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr"));
		
		int a[] = new int[mytable.size()-1];
		for(int i=2;i<a.length+1;i++) {
			String value =driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr["+i+"]/td[4]")).getText();
			a[i-2]=Integer.parseInt(value);
			if(max<a[i-2]) {
				max=a[i-2];
			}
			
		}
		
		for(int i=2;i<a.length+1;i++) {
			String value =driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr["+i+"]/td[4]")).getText();
			a[i-2]=Integer.parseInt(value);
			if(max==a[i-2]) {
				System.out.println(driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr["+i+"]/td[2]")).getText());
				System.out.println(driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr["+i+"]/td[1]")).getText());
			}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(null, null);
			action.clickAndHold(null);
		
			
			
		}
		
	}
}
		
		


