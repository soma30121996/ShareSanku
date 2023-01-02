package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework_utility.Utility_Methods;

public class DWS_ShopCart_Page {
	
	public DWS_ShopCart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='/cart'])[1]")
    WebElement click_cart; 

public void click_shopping_cart() {
	Utility_Methods.Click_element(click_cart);
	}

}
