package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Books_Page extends Utility_Methods{
	
	//Constructors
	public DWS_Books_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Web elements
			@FindBy(id="products-orderby")
			WebElement sortBy_position_dropdown;
			
			@FindBy(id="products-pagesize")
			WebElement display_dropdown;
			
			@FindBy(id="products-viewmode")
			WebElement View_as;
			
			@FindBy(xpath="(//a[contains(text(),'Computing and Internet')])[1]")
			WebElement product;
			
			@FindBy(xpath="(//input[@value='Add to cart'])[1]")
			WebElement add_to_cart;
			
			//methods
			public void sortby(String value) {
				dropdown_by_index(sortBy_position_dropdown, value);
			}

			public void display_dropdown(String value) {
				dropdown_by_index(sortBy_position_dropdown, value);
			}
			 
			public void View_as(String value) {
				dropdown_by_index(View_as, value);
			}
			
			public void click_prduct() {
				Click_element(product);
			}
			
			public void addTo_Cart_btn() {
				Click_element(add_to_cart);
			}


}
