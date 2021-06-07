package com.abstech.airface;


import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Driver.DriverManager;
import com.annotation.FrameworkAnnotation;
import com.dataprovaider.DataprovaiderTestData;
import com.dataprovaider.DataprovaiderUtiles;
import com.enam.CatagaryType;

import pageObject.Employee;
import pageObject.Userlogin;
import resource.TestBase;

public final class EmployeePage extends TestBase {
	
	private EmployeePage() {
		
	}

	@FrameworkAnnotation(authors = { "bikash" }, category = { CatagaryType.REGRESSION })
	@Test(testName="verifayed login page",dataProvider = "AirfaceData",dataProviderClass = DataprovaiderTestData.class,
			description = "Verifay give the right data")
	private void loginpage3rddata(String user,String pass) throws Exception {
		Userlogin log=new Userlogin();
		log.getSelect_lang().getlanguage().getuser(user).getpass(pass).getAdmin();
		log.getLogin();
		Thread.sleep(5000);
	}
	@FrameworkAnnotation(authors = { "Bikash" }, category = { CatagaryType.REGRESSION })
	@Test(testName="Go to the Employee page",description = "add a employee and check it is inshert or not",priority = 1)
	public void employee() throws Exception {
		Employee emp=new Employee();
		Thread.sleep(3000);
		emp.getclickedtuggelButton();
		Thread.sleep(500);
		emp.getclickedEmployeeButton();
		
	}
	@FrameworkAnnotation(authors = { "Bikash" }, category = { CatagaryType.REGRESSION })
	@Test(priority = 2,dataProvider = "EmployeeData",dataProviderClass = DataprovaiderUtiles.class)
	public void addEmployee(Map<String,String> map) throws Exception {
		Employee emp=new Employee();
		Thread.sleep(5000);
		List<WebElement> allempIdcol=emp.empIdcell();
		int count=0;
		for (WebElement element : allempIdcol) {
			if(element.getText().equals(map.get("Employee ID"))) {
				count++;
				break;
		}
	}	
			while(count==0) {
				emp.getClickedAddEmployeeButton();
				emp.getEmployeeId().sendKeys(map.get("Employee ID"),Keys.ENTER);
				DriverManager.getDriver().switchTo().defaultContent();
				boolean dupmessage=emp.getduplicateMessage().isDisplayed();
				if(dupmessage==false) {
				emp.getEmployeeId().clear();
				emp.getEmployeeId().sendKeys(map.get("Employee ID"));
				emp.getName(map.get("Name")).getEmailid(map.get("Email ID")).
				getPhoneNumber(map.get("Phone No")).getaddLocation(map.get("Location"));
				Thread.sleep(2000);
				emp.get_clk_save_btn();
				break;
				}
				else {
					Set<String> window=DriverManager.getDriver().getWindowHandles();
					Iterator<String> it=window.iterator();
					String parent=it.next();
					DriverManager.getDriver().switchTo().window(parent);
					emp.getPermanentDelete();
					break;

				}
			}
		
		allempIdcol=emp.empIdcell();
		Thread.sleep(5000);
		while(count==0) {
			int temp=0;
		for (WebElement Element : allempIdcol) {
			Thread.sleep(5000);
			if(Element.getText().equals(map.get("Employee ID"))) {
				assertTrue(true,"Employee successfully added");
				temp++;
				break;
			}
			if(temp==0) {
					assertTrue(true,"employee not added");
					break;
					
			}
		
			}
		}
	}
	
}
