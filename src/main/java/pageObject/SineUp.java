package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SineUp {
	public WebDriver driver;
	
	
	private By signUp_link=By.xpath("//a[contains(text(),'Sign Up Here')]");
	private By organization_name=By.id("organization_name");
	private By organization_email=By.id("organization_emailid");
	private By organization_mobile=By.id("organization_mobileno");
	private By organization_password=By.id("organization_password");
	private By organization_confirm_password=By.id("organization_password");
	private By organization_SingnUp_Button=By.id("btn_organization_signup");
	
	
	
	public SineUp(WebDriver driver) {
		this.driver=driver;
	} 
	public WebElement get_signup_link() {
		return driver.findElement(signUp_link);
	}
	public WebElement get_organization_name() {
		return driver.findElement(organization_name);
	}
	public WebElement get_organization_email() {
		return driver.findElement(organization_email);
	}
	public WebElement get_organization_mobile() {
		return driver.findElement(organization_mobile);
	}
	public WebElement get_organization_password() {
		return driver.findElement(organization_password);
	}
	public WebElement get_organization_confirm_password() {
		return driver.findElement(organization_confirm_password);
	}
	public WebElement get_organization_SingnUp_Button() {
		return driver.findElement(organization_SingnUp_Button);
	}
	public void getborder(WebElement element){
		   JavascriptExecutor js = ((JavascriptExecutor)driver);
		   js. executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid red;');", element);   
		 }

}
