package signUp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.TestBase;

public class SignUpPage  {
	

	
	
	@BeforeMethod
	public void before() {
		System.out.println("before method");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	@AfterSuite
	public void Aftersute() {
		System.out.println("after sute executed");
	}
}
