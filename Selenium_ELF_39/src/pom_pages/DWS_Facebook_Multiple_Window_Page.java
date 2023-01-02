package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Facebook_Multiple_Window_Page extends Utility_Methods {
	
	public DWS_Facebook_Multiple_Window_Page (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
// webElement
	@FindBy(xpath="//input[@name='email']")
	WebElement mail; 
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement password;

	@FindBy(xpath="(//span[text()='Log in'])[1]")
	WebElement click_fb_btn;
	
	
	
	
	// Methods
	
	public void parent(WebDriver driver) {
		multiple_parent_window(driver);
	}
	
	/*public void child(driver,) {
		multiple_child_window(null, click_fb_btn, null);
	}*/
	
	
	public void Click_mail(String email) {
		Enter_Value_To_Edit_Field(mail,email);
	}
	public void Click_password_fb(String pwd) {
		Enter_Value_To_Edit_Field(password, pwd);
	}
	public void Click_btn_ffb() {
		Click_element(click_fb_btn);
	}

}
