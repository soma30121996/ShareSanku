package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Computers_Page extends Utility_Methods{
	
	public DWS_Computers_Page(WebDriver driver) {
		PageFactory.initElements(driver,this );
		
	}
	
	//WebElement
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	WebElement computers;
	
	
	

}
