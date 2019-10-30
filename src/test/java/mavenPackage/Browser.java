package mavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	
	public static WebDriver browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){
				
            System.setProperty("webdriver.chrome.driver", "C:\\siva selenium\\chromedriver.exe");
		return new ChromeDriver();		
		                                }
		else if(browser.equalsIgnoreCase("fff"))
			  {
				 System.setProperty("webdriver.gecko.driver", "C:\\siva selenium\\drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
				 return new FirefoxDriver();
			 }
			  else
			  {
				  return null;
			  }
		
		}
	}
	    
