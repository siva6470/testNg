package mavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavemClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\siva selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		driver.close();

	}

}
