package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public BaseClass() {
		String browser = "chrome";
		if (driver == null) {

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "");
				driver = new FirefoxDriver();
			}
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://automationpractice.com/index.php");
			
		}

	}
	
	public boolean IsElementPresent(WebElement el)
	{
		boolean isPresent = false;
		
		if(el.isDisplayed())
		{
			isPresent = true;
		}
		
		return isPresent;
	}
}
