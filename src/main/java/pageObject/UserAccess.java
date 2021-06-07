package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAccess {
	public WebDriver driver;
	private By userAcc=By.cssSelector("ul.in:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
	
	//****************select user********************//
	private By user=By.cssSelector("#userList");
	private By menu=By.xpath("//select[@id='menuList']");
	
	//*************Record***********************//
	
	private By rec_message=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
	private By select_check=By.xpath("//input[@name='eo6']");
	private By uncheck=By.xpath("//input[@name='nc6']");
	
	
	
	
	
	
	public UserAccess(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement get_ueser_acc() {
		return driver.findElement(userAcc);
	}
	//****************select user********************//
	
	public WebElement get_select_user() {
		return driver.findElement(user);
	}
	public WebElement get_select_menu() {
		return driver.findElement(menu);
	}
	
	//*******************Record*******************//
	
	public WebElement get_record_msg() {
		return driver.findElement(rec_message);
	}
	public WebElement get_clk_checkbox() {
		return driver.findElement(select_check);
	}
	public WebElement get_clk_uncheckbox() {
		return driver.findElement(uncheck);
	}

}
