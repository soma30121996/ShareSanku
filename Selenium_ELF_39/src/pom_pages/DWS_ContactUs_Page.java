package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_ContactUs_Page extends Utility_Methods {
	
	public DWS_ContactUs_Page(WebDriver driver) {
			PageFactory.initElements( driver, this);
		}
		
		//WebElement
		@FindBy(id = "FullName")
		WebElement textfeild;
		
		@FindBy(id = "Email")
		WebElement emailtext;
		
		@FindBy(id = "Enquiry")
		WebElement enquiry;
		
	    @FindBy(xpath = "//input[@name='send-email']")
	    WebElement submit;

	    public void username(String name) {
	    	Enter_Value_To_Edit_Field(textfeild, name);
	    }

	    public void email(String emailenter) {
		Enter_Value_To_Edit_Field(emailtext,emailenter);
	    }

	    public void enquiry1(String enter) {
		Enter_Value_To_Edit_Field(enquiry, enter);
	    }
	    
	    public void clicksubmit() {
		Click_element(submit);
	    }

}
