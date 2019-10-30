package mavenPackage;

import org.testng.annotations.Test;

public class Invocation {
	
	@Test(invocationCount=5, enabled=false)
	public void login() {
		
		System.out.println("login exicuted  5 times");
		
		
	}
@Test(groups= {"Sanity","Smoke"})
	public void login2() {
		
		System.out.println("login exicuted  4 times");
		
		
	}
@Test(groups= {"Sanity"})
public void login3() {
	
	System.out.println("login exicuted  3 times");
	
	
}

@Test(groups= {"Smoke"})
public void login4() {
	
	System.out.println("login exicuted  2 times");
	
	
}


}
