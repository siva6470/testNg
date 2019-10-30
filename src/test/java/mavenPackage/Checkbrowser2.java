package mavenPackage;

import org.openqa.selenium.WebDriver;

public class Checkbrowser2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver; //here web driver is return type of bowser class.
	driver =	Browser.browser("chrome");
	driver.get("https://google.com/");
   Thread.sleep(2000);
   driver.close();
	}
}
