package com.abstech.airface;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.annotation.FrameworkAnnotation;
import com.dataprovaider.DataprovaiderTestData;
import com.enam.CatagaryType;


import pageObject.Userlogin;
import resource.TestBase;

public final class HomePage extends TestBase {

	
	public HomePage() {
		
	}
	@FrameworkAnnotation(authors = { "Bikash" }, category = { CatagaryType.REGRESSION })
	@Test(dataProvider = "AirfaceData",dataProviderClass = DataprovaiderTestData.class,
			priority = 1,testName="verifayed login page",description = "if enter wrong value how it is perform ",enabled = false)
	private void loginpage(String user,String pass) throws Exception {
		Userlogin log=new Userlogin();
		log.getSelect_lang().getlanguage().getuser(user).getpass(pass);
		log.getAdmin().getLogin();
		String actualvalue=" Email ID Or Password Or User Type do not match ! Please try again";
		SoftAssert assertion= new SoftAssert();
		assertion.assertEquals(actualvalue, log.gettextMessage());
		assertion.assertAll();
		
	}
	@FrameworkAnnotation(authors = { "Bikash" }, category = { CatagaryType.REGRESSION })
	@Test(dataProvider = "AirfaceData",dataProviderClass = DataprovaiderTestData.class,
			priority = 2,testName="verifayed login page",description = "if password not entered in pasasword field ",enabled = false)
	private void loginpage2ndData(String user,String pass) throws Exception {
		Userlogin log=new Userlogin();
		log.getSelect_lang().getlanguage().getuser(user);
		log.getAdmin().getLogin();
		String actualvalue=" Email ID Or Password Or User Type do not match ! Please try again";
		System.out.println(log.gettextMessage());
		SoftAssert assertion= new SoftAssert();
		/**assertion.assertEquals(actualvalue, log.gettextMessage());
		assertion.assertAll();*/
		
	}
	

	@FrameworkAnnotation(authors = { "bikash" }, category = { CatagaryType.REGRESSION })
	@Test(testName="verifayed login page",dataProvider = "AirfaceData",dataProviderClass = DataprovaiderTestData.class,
			description = "Verifay give the right data",priority = 3)
	private void loginpage3rddata(String user,String pass) throws Exception {
		Userlogin log=new Userlogin();
		log.getSelect_lang().getlanguage().getuser(user).getpass(pass).getAdmin();
		log.getLogin();
	}
}

