package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Compensatory {
	public WebDriver driver;
	public Actions a;
	private By Compensatory_leave=By.xpath("//span[contains(text(),'Compensatory Leave')]");
	//*************Apply off*******************//
	private By Apply_off=By.xpath("//*[@id=\"main-wrapper\"]/div/div[1]/div/div[1]/button");
	private By Date=By.xpath("//input[@placeholder='Enter Date']");
	private By select_employee=By.xpath("//*[@id=\"empList\"]");
	private By save=By.xpath("//input[@name='submit']");	
	//***********message validation******************
	private By Succ=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
	private By dup=By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1],");
	//**********search apply off****************//
	private By search=By.xpath("//input[@class='form-control form-control-sm']");
	private By seasrch_off=By.xpath("//input[@class='form-control form-control-sm']");
	//*********download************
    private By excel=By.xpath("//span[contains(text(),'Excel')]");
    private By pdf=By.cssSelector("button.dt-button:nth-child(2) > span:nth-child(1)");
	//*************edit page ******************//
    private By status=By.xpath("//body//td[6]");
	private By edit_button=By.xpath("//table[@id='example']//a[1]");
	private By update=By.xpath("//input[@name='update_compoff']");
	//*************delete*********************//
	
	private By delete=By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[7]/a[2]/i");
    
    
    
    
	
	
	public Compensatory(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getclk_Compensatory() {
		return driver.findElement(Compensatory_leave);
	}
	public WebElement getclk_Applu_off() {
		return driver.findElement(Apply_off);
	}
	public WebElement getclk_Date() {
		return driver.findElement(Date);
	}
	public WebElement getclk_Select_employee_id() {
		return driver.findElement(select_employee);
	}
	public WebElement getclk_Select_save() {
		return driver.findElement(save);
	}
	//*********success message**********//
	public WebElement getclk_succ_msg() {
		return driver.findElement(Succ);
	}
	public WebElement getclk_duplicate_msg() {
		return driver.findElement(dup);
	}
	
	//******search off***************//
	public WebElement get_clk_Search() {
		return driver.findElement(search);
	}
	public WebElement get_search_off() {
		return driver.findElement(seasrch_off);
	}

	// *********Download*************//
	public WebElement get_clk_excel() {
		return driver.findElement(excel);
	}

	public WebElement get_clk_employee_pdf() {
		return driver.findElement(pdf);
	}
	//*******edit page**********//
	public WebElement get_Status() {
		return driver.findElement(status);
	}
	public WebElement get_clk_edit_btn() {
		return driver.findElement(edit_button);
	}
	public WebElement get_clk_update() {
		return driver.findElement(update);
	}
	//***********delete***********//
	public WebElement get_clk_delete() {
		return driver.findElement(delete);
	}
 
}
