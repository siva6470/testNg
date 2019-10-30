package mavenPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\siva selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();		
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
		
//	Point P=new Point(300,700);
//	driver.manage().window().setPosition(P);

	
	//Another way of minimizing windows	
	
	Dimension d=new Dimension(300,700);
	driver.manage().window().setSize(d);
	Thread.sleep(5000);
	driver.close();
	
	}

}
