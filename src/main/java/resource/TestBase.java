package resource;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.Driver.Driver;

public class TestBase{

	protected TestBase() {
		
	}
	
	
	@BeforeTest
	protected void setUP() throws Exception {
		Driver.initializeDriver();
	}
	@AfterTest
	protected void tearDown() {
		Driver.quitDriver();
		
	}
}
