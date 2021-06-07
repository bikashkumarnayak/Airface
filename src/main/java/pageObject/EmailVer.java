package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailVer {
	public WebDriver driver ;
	
	private By gmail=By.xpath("//a[contains(text(),'Gmail')]");
	private By emailid=By.id("Email");
	private By next_btn=By.id("next");
	private By pass=By.id("password");
	private By pass_next=By.xpath("//*[@id=\"submit\"]");
	//*********email verification*********
	private By email_verification=By.className("bog");
	
	
	
	public EmailVer(WebDriver driver) {
		this.driver=driver;
	}
//	public WebElement get_gmail() {
//		return driver.findElement(gmail);
//	}
	public WebElement get_email() {
		return driver.findElement(emailid);
	
	}
	public WebElement get_next_btn() {
		return driver.findElement(next_btn);
	}
	public WebElement get_pass() {
		return driver.findElement(pass);
		
	}
	public WebElement get_next_pass_btn() {
		return driver.findElement(pass_next);
		
	}
	public List<WebElement> get_email_verification() {
		return driver.findElements(email_verification);
	}
	

}
