package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Search_Page extends Utility_Methods {
	
	public DWS_Search_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	WebElement search;
	
	//Click Search button
	@FindBy(xpath="//input[@type='submit']")
	WebElement click_search;
	
	//methods
	public void search(String value){
		Enter_Value_To_Edit_Field(search,value);
	}
	
	public void click_search(){
		Click_element(click_search);
	}

}
