package selenium_Basics_Assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class EndTOEndPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement radio =driver.findElement(By.xpath("//input[@value='radio1']"));
	radio.click();
	//driver.findElement(By.xpath("//input[@value='radio1']")).click();
	
	
	//Auto Suggestions
	driver.findElement(By.id("autocomplete")).sendKeys("Ind");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[text()='India'])[1]")).click();
	
	WebElement dropdown=driver.findElement(By.xpath("//select"));
	Select sel = new Select(dropdown);
	sel.selectByIndex(0);
	
	
	driver.findElement(By.name("checkBoxOption1")).click();
	
	String parent =driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.id("openwindow")).click();
	
	Set<String> total=driver.getWindowHandles();
	
	for(String child : total) {
		driver.switchTo().window(child);
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://www.qaclickacademy.com/")) {
			driver.findElement(By.linkText("Register")).click();
			driver.close();
		}}
		
	
	driver.switchTo().window(parent);
	
	
	driver.findElement(By.id("name")).sendKeys("soma");
	Thread.sleep(1000);
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(1000);
	
	Alert ale= driver.switchTo().alert();
	
	ale.accept();
	
	String mouse_hover =driver.findElement(By.xpath("(//fieldset/legend)[11]")).getText();
		
	System.out.println(mouse_hover);	
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Top']"))).perform();
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();
	
	String tabletext=driver.findElement(By.xpath("(//td//following-sibling::td[contains(text(),30)])[1]")).getText();
	System.out.println(tabletext);
	
	driver.switchTo().frame(0);
	action.sendKeys(Keys.PAGE_DOWN).perform();
	driver.findElement(By.linkText("Contact Us")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//ul/li/a[contains(text(),'REST')]")).click();
	Set<String> bottomlink=driver.getWindowHandles();
	for(String link:bottomlink) {
		driver.switchTo().window(link);
		System.out.println(link);
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.restapitutorial.com/")) {
			String tutorial = driver.findElement(By.xpath("(//li/a[contains(text(),'What')])[1]")).getText();
			System.out.println(tutorial);
			driver.navigate().back();
		}}
	
	
	driver.switchTo().window(parent);
	action.sendKeys(Keys.PAGE_UP).perform();
	List<WebElement>pls= driver.findElements(By.xpath("//header/div/button"));
	for(int i=0;i<=pls.size()-1;i++) {
		pls.get(i).click();
	}
	
	
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File homepage =ts.getScreenshotAs(OutputType.FILE);

	File destination = new File("./Screenshots/ss2.png");
	FileHandler.copy(homepage, destination);
	
	
	
		
	
	
	
	
	
	


	

}}
