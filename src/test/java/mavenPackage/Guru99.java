package mavenPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		driver=Browser.browser("chrome");
		driver.get("https://www.guru99.com/gecko-marionette-driver-selenium.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String str=driver.getTitle();
		System.out.println(str);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		String str2=driver.getTitle();
		System.out.println(str2);
		
	
		driver.quit();
		
		
	}

}
