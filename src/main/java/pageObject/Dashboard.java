package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	public WebDriver driver;
	private By totalemployee=By.xpath("//*[@id=\"main-wrapper\"]/div/div[2]/div[1]/div[1]/div/div/div[3]/h2");
	private By absentemployee=By.xpath("//*[@id=\"main-wrapper\"]/div/div[2]/div[1]/div[3]/div/div/div[3]/h2");
	private By presentemployee=By.xpath("//*[@id=\"main-wrapper\"]/div/div[2]/div[1]/div[2]/div/div/div[3]/h2/a");
	
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement gettotalemployee() {
		return driver.findElement(totalemployee);
	}
	public WebElement getabsentemployee() {
		return driver.findElement(absentemployee);
	}
	public WebElement getpresentemployee() {
		return driver.findElement(presentemployee);
	}

}
