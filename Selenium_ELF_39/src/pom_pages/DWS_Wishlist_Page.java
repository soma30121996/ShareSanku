package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Wishlist_Page extends Utility_Methods {
	
	 public DWS_Wishlist_Page(WebDriver driver) {
		 PageFactory.initElements(driver, this);
 
	 }
	 
	//WebElement
		@FindBy(xpath="//span[text()='Wishlist']")
		WebElement wishlist;
		
		//methods
		public void click_wishlist() {
			Click_element(wishlist);
		}


	
}
