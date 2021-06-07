package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserList {

	public WebDriver driver;
	public Actions a;
	public JavascriptExecutor js; 
	
	private By authontication=By.cssSelector("li.sidebar-item:nth-child(6) > a:nth-child(1) > span:nth-child(2)");
	private By userList=By.cssSelector("ul.in:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
	//**********add user list************
	private By add_user=By.cssSelector(".buttons-copy");
	private By select_employee=By.xpath("//select[@id='empList']");
	private By empid=By.xpath("//input[@id='empid']");
	private By loc=By.xpath("//input[@id='location']");
	private By pass=By.cssSelector("#userpassword");
	private By con_pass=By.xpath("//input[@id='confirmpassword']");
	private By save_btn=By.xpath("//button[@name='submit_user']");
	
	//**********pass validation****************//
	
	private By error=By.xpath("//label[@id='userpassword-error']");
	private By conf_error=By.xpath("//label[@id='userpassword-error']");
	
	//**********search employee***************//
	
	private By search=By.cssSelector(".form-control");
	private By ser_emp=By.cssSelector(".odd > td:nth-child(3)");
	
	//**********message veryfication********//
	
	private By succ=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
	
	
	
	
	
	
	
	public UserList(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement get_authontication() {
		return driver.findElement(authontication);
	}
	public WebElement get_userlist() {
		return driver.findElement(userList);
	}
	
	//*********add user list*************//
	
	public WebElement get_add_user() {
		return driver.findElement(add_user);
	}
	public WebElement get_select_employee() {
		return driver.findElement(select_employee);
	}
	public WebElement get_employeeid() {
		return driver.findElement(empid);
	}
	public WebElement get_location() {
		return driver.findElement(loc);
	}
	public WebElement get_password() {
		return driver.findElement(pass);
	}
	public WebElement get_conf_password() {
		return driver.findElement(con_pass);
	}
	public WebElement get_save_btn() {
		return driver.findElement(save_btn);
	}
	//*******pass validation**************//
	public WebElement get_password_validation() {
		return driver.findElement(error);
	}
	public WebElement get_password_conf_validation() {
		return driver.findElement(conf_error);
	}
	
	//**********search employee**********//
	
	public WebElement get_search() {
		return driver.findElement(search);
	}
	public WebElement get_search_emp() {
		return driver.findElement(ser_emp);
	}
	//*******verify success message******//
	public WebElement get_succ_msg() {
		return driver.findElement(succ);
	}
	
	
	
}
