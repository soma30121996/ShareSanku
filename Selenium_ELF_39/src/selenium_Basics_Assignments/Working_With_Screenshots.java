package selenium_Basics_Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Take ScreenShot typeCasting with driver instance
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temperory =ts.getScreenshotAs(OutputType.FILE);
		
		//
		File destination = new File("./Screenshots/ss1.png");
		FileHandler.copy(temperory, destination);
		
		

	}

}
