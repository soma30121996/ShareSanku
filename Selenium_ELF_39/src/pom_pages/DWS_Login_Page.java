package pom_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import framework_utility.Utility_Methods;

public class DWS_Login_Page extends Utility_Methods{
	
	//Constructor to initialize the driver instance and WebElement
	
	public DWS_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElements
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	
	
	//Methods
	public void username(String value) {
		//username.sendKeys(value);
		Enter_Value_To_Edit_Field(login_btn, value);
	}
	
	
	public void password(String value) {
		//password.sendKeys(value);
		Enter_Value_To_Edit_Field(password, value);

	}
	
	public void click_Login() {
		//login_btn.click();
		Click_element(login_btn);
	}

}
