package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Weekend {

	public WebDriver driver;
	private By shift_schedule=By.cssSelector("li.sidebar-item:nth-child(7) > a:nth-child(1) > span:nth-child(2)");
	private By weekend=By.xpath("//span[contains(text(),'Weekend')]");
	private By weekend_location=By.xpath("//select[@id='locationList']");
	private By weekend_shift=By.xpath("//select[@id='shiftList']");
	private By weekend_Definition=By.className("row border-bottom");
	private By all=By.id("MonAll");
	private By save=By.xpath("//button[@name='submit_user']");
	private By succ=By.cssSelector(".alert");
	
	
	
	
	
	public Weekend(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement get_shift() {
		return driver.findElement(shift_schedule);
	}
	public WebElement get_weekend() {
		return driver.findElement(weekend);
	}
	public WebElement get_weekend_location() {
		return driver.findElement(weekend_location);
	}
	public WebElement get_weekend_shift() {
		return driver.findElement(weekend_shift);
	}
	public List<WebElement> get_weekend_Definition() {
		return driver.findElements(weekend_Definition);
	}
	public WebElement get_clk_all() {
		return driver.findElement(all);
	}
	public WebElement get_save() {
		return driver.findElement(save);
	}
	public WebElement get_success_message() {
		return driver.findElement(succ);
	}
	
}
