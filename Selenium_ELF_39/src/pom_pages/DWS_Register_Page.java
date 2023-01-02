package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import framework_utility.Utility_Methods;

public class DWS_Register_Page extends Utility_Methods{
	
	//Constructor to initialize the driver instance and WebElement
	public DWS_Register_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//WebElements
	@FindBy(id="gender-male")
	WebElement radio_male_btn;
	
	@FindBy(id="gender-female")
	WebElement radio_female_btn;
	
	@FindBy(name="FirstName")
	WebElement FN_text_filed;
	
	@FindBy(name="LastName")
	WebElement LN_Password;
	
	@FindBy(id="Email")
	WebElement Email_text_filed;
	
	@FindBy(name="Password")
	WebElement Password_text_filed;
	
	@FindBy(name="ConfirmPassword")
	WebElement ConfirmPassword_text_filed;
	
	@FindBy(id="register-button")
	WebElement register_btn;
	
	//methods
	public void click_Radio_Male() {
		Click_element(radio_male_btn);
	}
	
	public void click_Radio_Female() {
		Click_element(radio_female_btn);
	}
	
	public void firstName(String value) {
		Enter_Value_To_Edit_Field(FN_text_filed, value);
	}
	
	public void lastName(String value) {
		Enter_Value_To_Edit_Field(LN_Password, value);
	}
	
	public void email(String value) {
		Enter_Value_To_Edit_Field(Email_text_filed, value);
	}
	
	public void password(String value) {
		Enter_Value_To_Edit_Field(Password_text_filed, value);
	}
	
	public void confirm_Password(String value) {
		Enter_Value_To_Edit_Field(ConfirmPassword_text_filed, value);
	}
	
	public void click_Register() {
		Click_element(register_btn);
	}
	
	

}
