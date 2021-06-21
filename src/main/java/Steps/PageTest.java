package Steps;

import PageObject.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PageTest{
	PageObject pageObj;
	
	public PageTest()
	{
		pageObj = new PageObject();
	}
		
	@Given("^click WomenPage$")
	public void click_WomenPage(){
		pageObj.getWomenPageElement().click();
		System.out.println("WomenPage Clicked");
	}

	@Then("^verify WomenPage present$")
	public void verify_WomenPage_present() {
		pageObj.IsElementPresent(pageObj.getWomenPageElement());
		System.out.println("WomenPage Present");
		System.out.println("WomenPage Present");
	}
	
	@Then("^quit Browser$")
	public void quit_Browser(){
	    // Write code here that turns the phrase above into concrete actions
		pageObj.quitBrowser();
	}

}
