package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AuthkKey {
	public WebDriver driver;
	public Actions a;
	
	private By Auth_key=By.xpath("//span[contains(text(),'Auth Key')]");
	private By key=By.xpath("//button[@class='btn btn-secondary']");
	
	
	
	
	
	
	
	public AuthkKey(WebDriver driver) {
		this.driver=driver;
		
		}
	public WebElement get_clk_authKey() {
		return driver.findElement(Auth_key);
	}
	public WebElement get_clk_key() {
		return driver.findElement(key);
	}
	
	
}
