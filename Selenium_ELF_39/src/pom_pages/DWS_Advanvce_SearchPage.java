package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Advanvce_SearchPage extends Utility_Methods{
	
	public DWS_Advanvce_SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//WebElement
	@FindBy(id="As")
	WebElement Advancesearch_Checkbox;

	@FindBy(id="Cid")
	WebElement Category_dropdown;

	@FindBy(id="Mid")
	WebElement Manufacturer_dropdown;

	@FindBy(id="Pf")
	WebElement from_textfield;

	@FindBy(id="Pt")
	WebElement to_texfield;

	@FindBy(xpath = "(//input[@type='submit'])[2]")
	WebElement finalSearch_button;

	//Methods
	public void click_advancesearch_checkbox() {
	Click_element(Advancesearch_Checkbox);
	}

	public void Click_Categorydropdown_button(String value) {
	dropdown_by_index(Category_dropdown,value );
	}

	public void Click_Manufacturerdropdown_button(String value) {
		dropdown_by_index(Manufacturer_dropdown, value);
	}

	public void Enter_from_textfield(String value) {
	Enter_Value_To_Edit_Field(from_textfield, value);
	}

	public void Enter_to_textfield(String value) {
		Enter_Value_To_Edit_Field(to_texfield, value);
	}

	public void click_finalsearch_button() {
		Click_element(finalSearch_button);
	}

}
