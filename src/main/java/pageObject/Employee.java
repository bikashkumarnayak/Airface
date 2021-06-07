package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Driver.DriverManager;
import com.utility.CommonUtulity;

public class Employee extends CommonUtulity {
	
    private By Tuggel=By.xpath("//a[@class='nav-link sidebartoggler waves-effect waves-light']");
    private By employee=By.xpath
    		("//a[contains(@class,'waves-effect waves-dark')]//span[contains(text(),'Employee')]");
    private By add_Employee=By.xpath("//a[@class='buttons-copy buttons-html5 btn btn-primary mr-1 mb-2']");
    //***********Add Employee************//
    private By Employee_ID=By.id("employeeid");
    private By email_ID=By.id("employeeemailid");
    private By Name=By.id("employeename");
    private By Location=By.xpath("//select[@class='custom-select mb-3']");
    private By phone_number=By.id("employeephoneno");
    private By save=By.xpath("//button[@name='submit_candidate']");
    //Duplicate message validation
    private By dupmsg=By.xpath("//i[@class='emp-check']");
    //dynamic table handle
    private By empIDcoloum=By.xpath("//tr/td[2]");
    
    
    
    private By exist=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]");
    private By parmanently_delete=By.xpath("//body/div[@id='main-wrapper']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[2]");
    //*********search employee********//
    private By search=By.xpath("//input[@class='form-control form-control-sm']");
    private By table=By.xpath("//table[@id='example']");
    private By row=By.tagName("tr");
    private By emp_id_col=By.xpath("//td[2]");
    private By emp_edit=By.xpath("//td[8]//a[3]");
    //*********download************//
    private By excel=By.xpath("//button[@class='dt-button buttons-excel buttons-html5']");
    private By pdf=By.xpath("//button[@class='dt-button buttons-pdf buttons-html5']");
    //***************upload csv file**********
    private By upload_csv=By.xpath("//button[@title='Add CSV File']");
    private By brows_btn=By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[1]/div[2]");
    private By select_location=By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[2]/select");
    private By  submit=By.xpath("//input[@type='submit']");
  //Go to the parmanent window
  	private By permadel=By.cssSelector
  			("#myModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(2)");
    //**********message***************//
    private By ver_succ=By.cssSelector(".alert");
    private By edit_delete_message=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
    //***********button************************//
    private By cancel=By.xpath("//a[@class='btn btn-danger']");
    private By update=By.xpath("//button[@name='update_candidate']");
    private By delete=By.xpath("//td[8]//a[4]");
    //**********employee enrollment*******//
    @FindBy(xpath="//button[@id='captureBtn']")
    private WebElement cap_btn;
    private By capture_btn=By.xpath("//button[@id='captureBtn']");
    private By capture_submit=By.xpath("//input[@type='submit']");
    
    
    
    
	
	
	public Employee getclickedtuggelButton() throws Exception {
		clktAction(Tuggel, "tuggel button");
		return this;
	}
	public Employee getclickedEmployeeButton() throws Exception {
		clktAction(employee, "employee button");
		return this;
	}
	public Employee getClickedAddEmployeeButton() throws Exception {
		click(add_Employee, "clickAdd Employee Button");
		return this;
	}

	// *******add employee*********************
	public WebElement getEmployeeId() throws Exception {
		return DriverManager.getDriver().findElement(Employee_ID);
		
	}
	public Employee getName(String name) throws Exception {
		sendKeys(Name, name, "enter neme");
		return this;
	}
	public Employee getEmailid(String EmailId) throws Exception {
		sendKeys(email_ID, EmailId, "Entered email id");
		return this;
	}


	public Employee getPhoneNumber(String phonenumber) throws Exception {
		sendKeys(phone_number, phonenumber, "Enter number");
		return this;
	}

	public Employee getaddLocation(String Locationname) {
		 selectDropDown(Location, "visibletext", Locationname);
		 return this;
	}

	public Employee get_clk_save_btn() throws Exception {
		click(save, "save button clicked");
		return this;
	}

	//Dynamic table handle
	public List<WebElement> empIdcell() {
		return DriverManager.getDriver().findElements(empIDcoloum);
	}
	//Duplicate Message
	public WebElement getduplicateMessage() {
		return DriverManager.getDriver().findElement(dupmsg);
	}
	public Employee getPermanentDelete() throws Exception {
		click(parmanently_delete, "clicked permanent delete");
		return this;
	}

}
