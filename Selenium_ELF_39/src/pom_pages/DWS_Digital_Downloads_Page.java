package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Digital_Downloads_Page extends Utility_Methods {
	
	
	public DWS_Digital_Downloads_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Web elements
	@FindBy(id="products-orderby")
	WebElement sortBy_position_dropdown;
	
	@FindBy(id="products-pagesize")
	WebElement display_dropdown;
	
	@FindBy(id="products-viewmode")
	WebElement View_as;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement add_to_cart;
	
	@FindBy(xpath="(//span[@class='class'])[1]")
	WebElement close_btn;
	
	
	//Methods 
	public void sortby(String value) {
		dropdown_by_index(sortBy_position_dropdown, value);
	}

	public void display_dropdown(String value) {
		dropdown_by_index(sortBy_position_dropdown, value);
	}
	 
	public void View_as(String value) {
		dropdown_by_Visible_text(View_as, value);
	}
	
	public void addTo_Cart_btn() {
		Click_element(add_to_cart);
	}
	
	public void close() {
		Click_element(close_btn);
	}
}
