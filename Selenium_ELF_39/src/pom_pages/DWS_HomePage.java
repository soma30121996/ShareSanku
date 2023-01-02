package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_HomePage extends Utility_Methods{
	
	//Constructor to initialize the driver instance and web element
	
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Web elements
	
	//register
	@FindBy(linkText = "Register")
	WebElement reg_link;
	
	//login
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login_link;
	
	//search
	@FindBy(name="q")
	WebElement search;
	
	//Click Search button
	@FindBy(xpath="//input[@type='submit']")
	WebElement click_search;
	
	//Shopping cart
	@FindBy(xpath="//span[contains(text(),'Shopping')]")
	WebElement shopping_cart;
	
	//Wishlist
	@FindBy(xpath ="//span[contains(text(),'Wishlist')]")
	WebElement Wishlist;
	
	//Books
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	WebElement books;
	
	//digital downloads
	@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	WebElement digital_downloads;
	
	//jewellery
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	WebElement jewellery;
	
	//Electronics
	@FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	WebElement Electronics;
		
	//GiftCard
	@FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement GiftCard;
		
		
	//Apparel_And_Shoes
	@FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	WebElement Apparel_And_Shoes;
	
	//facebook
	@FindBy(xpath="//a[contains(text(),'Facebook')]")
	WebElement DWS_Facebook;
		
	//contact us
	@FindBy(xpath="(//a[contains(text(),'Contact us')])[1]")
	WebElement Contactus;
	

	//Method
	public void click_Login(){
		Click_element(login_link);
	}
	
	public void click_Reg(){
		Click_element(reg_link);
	}
	
	public void click_shopping_cart(){
		Click_element(Wishlist);
	}
	
	public void click_Wishlist(){
		Click_element(shopping_cart);
	}
	
	public void click_digital_downloads(){
		Click_element(digital_downloads);
	}
	
	public void click_jewllery(){
		Click_element(jewellery);
	}
	
	public void click_GiftCard(){
		Click_element(GiftCard);
	}
	
	public void click_Apparel_And_Shoes(){
		Click_element(Apparel_And_Shoes);
	}
	
	public void search(String value){
		Enter_Value_To_Edit_Field(search,value);
	}
	
	public void click_search(){
		Click_element(click_search);
	}

	public void click_facebook(){
		Click_element(DWS_Facebook);
	}
	
	public void click_Electronics(){
		Click_element(Electronics);
	}
	
	public void click_Books(){
		Click_element(books);
	}
	
	public void click_Contactus(){
		Click_element(Contactus);
	}

	
	
	
	
	

}
