package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shift {

	public WebDriver driver;
	
	private By shift_schedule=By.cssSelector("li.sidebar-item:nth-child(7) > a:nth-child(1) > span:nth-child(2)");
	private By shift=By.xpath("//span[contains(text(),'Shift(s)')]");
		
	//*****************add shift************************//
	
	private By add_shift=By.cssSelector(".buttons-copy");
	private By shift_name=By.xpath("//input[@placeholder='Enter Shift Name']");
	private By start_time=By.xpath("//input[@placeholder='Enter Time']");
	private By end_time=By.xpath("//input[@placeholder='Enter Date']");
	private By Shift_mng=By.xpath("//input[@name='shift_margin']");
	private By location=By.xpath("//select[@id='locationList']");
	private By save=By.xpath("//input[@name='submit']");
	
	//**********pop up message***************************//
	
	private By succ_msg=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
	
	//***********search**********//
	private By Table=By.xpath("//table[@id='example']//tbody");
	private By row=By.tagName("tr");
	private By Shift_name_col=By.xpath("//td[2]");
	//********edit shift***************//
	private By edit=By.xpath("//td[8]//a[1]");
	private By update=By.xpath("//input[@name='update_shift']");
	//**********delete****************//
	private By Delete=By.xpath("//td[8]//a[2]");
	//*********download************
    private By excel=By.xpath("//span[contains(text(),'Excel')]");
    private By pdf=By.cssSelector("button.dt-button:nth-child(2) > span:nth-child(1)");

	

	public Shift(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement get_clk_shift_schedulde() {
		return driver.findElement(shift_schedule);
	}
	public WebElement get_clk_shift() {
		return driver.findElement(shift);
	}
	public WebElement get_clk_add_shift() {
		return driver.findElement(add_shift);
	}
	
	//*****************add shift************//
	
	public WebElement get_shift_name() {
		return driver.findElement(shift_name);
	}
	public WebElement get_shift_start_time() {
		return driver.findElement(start_time);
	}
	public WebElement get_shift_end_time() {
		return driver.findElement(end_time);
	}
	public WebElement get_shift_mng() {
		return driver.findElement(Shift_mng);
	}
	public WebElement get_shift_location() {
		return driver.findElement(location);
	}
	public WebElement get_clk_save_btn(){
		return driver.findElement(save);
	}
	public WebElement get_succ_message(){
		return driver.findElement(succ_msg);
	}
	//**********find shift***********//
	
	public List<WebElement> get_row() {
		WebElement table=driver.findElement(Table);
		return table.findElements(row);
	}
	public List<WebElement> get_Shift_col() {
		WebElement table=driver.findElement(Table);
		return table.findElements(Shift_name_col);
	}
	//********edit shift***************//
	public List<WebElement> get_edit_btn() {
		WebElement table=driver.findElement(Table);
		return table.findElements(edit);
	}
	public WebElement get_update(){
		return driver.findElement(update);
	}
	//***********delete****************//
	public List<WebElement> get_delete_btn() {
		WebElement table=driver.findElement(Table);
		return table.findElements(Delete);
	}

	// *********Download*************//
	public WebElement get_clk_excel() {
		return driver.findElement(excel);
	}

	public WebElement get_clk_employee_pdf() {
		return driver.findElement(pdf);
	}
}
