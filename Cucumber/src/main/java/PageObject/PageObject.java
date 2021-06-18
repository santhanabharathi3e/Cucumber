package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class PageObject extends BaseClass {

	@FindBy(xpath="//*[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/*[text() = 'Women']")
	private WebElement womePage;
	
	public PageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomenPageElement()
	{
		return womePage;
	}
	
	public void quitBrowser()
	{
		driver.quit();
		System.out.println("Browser is quitted");
	}
	
}
