package pom_pages;




import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_Methods;

public class DWS_Vote_Page extends Utility_Methods {
	
	public DWS_Vote_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//WebElements
	//@FindBy(xpath="(//ul/li[@class='answer']/input[@type='radio'])[1]")
	//WebElement vote;
	@FindBy(xpath="//ul/li[@class='answer']/input[@type='radio']")
	List<WebElement> vote;
	
	@FindBy(xpath="//input[@id='vote-poll-1']")
	WebElement vote_click;
	
	
	
	//Methods
	/*public void voteradio() {
	vote.click();
		
		}*/
	
	public void voteradio() {
		for(int i=0;i<vote.size();i++) {
			vote.get(i).click();
		}
		
	}
	
	
	
	public void Click_vote() {
		Click_element(vote_click);
	
	}
	
}
