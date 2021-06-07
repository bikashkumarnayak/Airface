package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeShiftMapping {

	public WebDriver driver;
	
	private By Emp_Shift_map=By.xpath("//span[contains(text(),'Employee Shift Mapping')]");
	//*************add Shift*****************//
	private By add_shift=By.cssSelector(".buttons-copy");
	private By select_employee=By.xpath("//select[@id='empList']");
	private By select_shift=By.cssSelector("#shiftList");
	private By Start_date=By.xpath("//input[@id='shiftStart']");
	private By end_date=By.xpath("//input[@id='shiftEnd']");
	private By save=By.xpath("//button[@name='submit_emp_shift']");
	
	//*********Message valisdation******************//
	
	private By succ_msg=By.cssSelector(".alert-dismissible");
	private By upadate=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
	
	//***********search**********//
		private By Table=By.xpath("//table[@id='example']//tbody");
		private By row=By.tagName("tr");
		private By emp_id_col=By.xpath("//td[2]");
	//**********edit employee**************//
	
	private By edit_btn=By.xpath("//td[7]//a[1]");
	private By Edti_sel_emp=By.xpath("//select[@id='empList']");
	private By Edit_shift=By.cssSelector("#shiftList");
	private By update=By.xpath("//button[@name='update_emp_shift']");
	
	//************delete***********//
	private By delete_btn=By.xpath("//td[7]//a[2]");
	//*********download************
    private By excel=By.xpath("//span[contains(text(),'Excel')]");
    private By pdf=By.cssSelector("button.dt-button:nth-child(2) > span:nth-child(1)");


	
	
	
	
	public EmployeeShiftMapping(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement get_clk_Employee_Shift_Mapping() {
		return driver.findElement(Emp_Shift_map);
	}
	//**********Add Shift****************//
	public WebElement get_add_Shift() {
		return driver.findElement(add_shift);
	}
	public WebElement get_select_employee() {
		return driver.findElement(select_employee);
	}
	public WebElement get_select_Shift() {
		return driver.findElement(select_shift);
	}
	public WebElement get_start_date() {
		return driver.findElement(Start_date);
	}
	public WebElement get_end_date() {
		return driver.findElement(end_date);
	}
	public WebElement get_save() {
		return driver.findElement(save);
	}
	//******message validation***********//
	public WebElement get_success() {
		return driver.findElement(succ_msg);
	}
	public WebElement get_update() {
		return driver.findElement(upadate);
	}
	
	//**********shift search*********//
	
	public List<WebElement> get_row() {
		WebElement table=driver.findElement(Table);
		return table.findElements(row);
	}
	public List<WebElement> get_Shift_col() {
		WebElement table=driver.findElement(Table);
		return table.findElements(emp_id_col);
	}
	//******edit page********//
	
	public List<WebElement> get_edit_btn() {
		WebElement table=driver.findElement(Table);
		return table.findElements(edit_btn);
	}
	public WebElement get_edit_sel_emp() {
		return driver.findElement(Edti_sel_emp);
	}
	public WebElement get_edit_sel_shift() {
		return driver.findElement(Edit_shift);
	}
	public WebElement get_update_btn() {
		return driver.findElement(update);
	}
	//************delete*****************//
	public List<WebElement> get_delete_btn() {
		WebElement table=driver.findElement(Table);
		return table.findElements(delete_btn);
	}
	// *********Download*************//
		public WebElement get_clk_excel() {
			return driver.findElement(excel);
		}

		public WebElement get_clk_employee_pdf() {
			return driver.findElement(pdf);
		}
	

	
}
