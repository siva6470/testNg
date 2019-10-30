package mavenPackage;

import org.testng.annotations.Test;

public class TestNg {
	@Test(priority=1)
	public void displayd() {
		System.out.println("with priority 1 exicutes second");
		
		
		
	}
	
	@Test//(priority=1)
	public void displaya() {
		
		System.out.println("with priority zero exicutes first");
		
	}

}
