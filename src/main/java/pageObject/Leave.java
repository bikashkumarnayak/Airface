package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Leave {
	public WebDriver driver;
	public Actions a;
	private By Leave = By.cssSelector("ul.in:nth-child(2) > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)");
	// **********Apply leave******************//

	private By addApply = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]");
	private By start_date = By.xpath("//div[@id='myModal']//div[@class='row']//div[1]//div[1]//input[1]");
	private By leave_date = By.xpath("//div[@id='myModal']//div[@class='row']//div[2]//div[1]//input[1]");
	private By select_employee = By.xpath("//select[@id='empList']");
	private By leave_Type = By.xpath("//select[@id='leaveTypeList']");
	private By leave_purpose = By.xpath("//textarea[@placeholder='Enter Leave Purpose']");
	private By submit = By.xpath("//input[@name='submit']");

	// ***************insert leave search*******************//
	private By search = By.xpath("//input[@class='form-control form-control-sm']");
	private By table = By.xpath("//table[@id='example']//tbody");
	private By row = By.tagName("tr");
	private By Columns = By.tagName("td");
	// *************messages*******************************//

	private By delete_msg = By.cssSelector(".alert");
	private By veryfy_message = By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");

	// **************status******************************//
	private By status = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]");
	// *************button***************//
	private By edit = By.xpath("//td[8]//a[1]");
	private By update = By.xpath("//input[@name='update_leave']");
	private By delete = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/a[2]");
	// *********download*****************//
	private By excel = By.xpath("//span[contains(text(),'Excel')]");
	private By pdf = By.cssSelector("button.dt-button:nth-child(2) > span:nth-child(1)");
	// **************delete************//
	private By emp = By.xpath("//td[2]");
	private By Status = By.xpath("//td[7]");
	private By Delete=By.xpath("//td[8]//a[2]");
	
	
	
	

	public Leave(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement get_leave() {
		return driver.findElement(Leave);
	}

	// **********Apply leave**************
	public WebElement get_Leave_apply() {
		return driver.findElement(addApply);
	}

	public WebElement get_Start_Leave() {
		return driver.findElement(start_date);
	}

	public WebElement get_leave_Leave() {
		return driver.findElement(leave_date);
	}

	public WebElement get_select_employee() {
		return driver.findElement(select_employee);
	}

	public WebElement get_leave_type() {
		return driver.findElement(leave_Type);
	}

	public WebElement get_leave_purpose() {
		return driver.findElement(leave_purpose);
	}

	public WebElement get_submit() {
		return driver.findElement(submit);
	}

	// ***********insert leave search***********//
	public WebElement get_search() {
		return driver.findElement(search);
	}

	public List<WebElement> get_row() {
		WebElement tables = driver.findElement(table);
		return tables.findElements(row);
	}

	public List<WebElement> get_coloun() {
		WebElement tables = driver.findElement(table);
		return tables.findElements(Columns);
	}

	public List<WebElement> get_edit_btn() {
		return driver.findElements(edit);
	}

	// ***********message********************//
	public WebElement get_delete_msg() {
		return driver.findElement(delete_msg);
	}

	public WebElement get_Veryfay_message() {
		return driver.findElement(veryfy_message);
	}

	// **********Status********************//
	public WebElement get_status() {
		return driver.findElement(status);
	}

	// *********button********************//
	public WebElement get_edit() {
		return driver.findElement(edit);
	}

	public WebElement get_update() {
		return driver.findElement(update);
	}

	public WebElement get_delete() {
		return driver.findElement(delete);
	}

	// *********Download*************//
	public WebElement get_clk_excel() {
		return driver.findElement(excel);
	}

	public WebElement get_clk_employee_pdf() {
		return driver.findElement(pdf);
	}

	// ***********delete*************//
	public WebElement get_emp_col() {
		return driver.findElement(emp);
	}

	public WebElement get_status_col() {
		return driver.findElement(Status);
	}
	public List<WebElement> get_Delete_btn() {
		return driver.findElements(Delete);
	}

}
