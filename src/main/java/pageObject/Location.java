package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Driver.DriverManager;
import com.utility.CommonUtulity;

public final class Location extends CommonUtulity{
	
	
	private By Tuggel=By.xpath("//a[@class='nav-link sidebartoggler waves-effect waves-light']");
	private By setting=By.xpath("//span[contains(text(),'Settings')]");
	private By location=By.xpath("//span[contains(text(),'Locations')]");
	private By addLocation=By.xpath("//a[@class='buttons-copy buttons-html5 btn btn-primary mr-1 mb-2']");
	private By locationName=By.cssSelector("#location");
	private By submitLocation=By.xpath("//button[@name='submit_location']");
	/*Handle dynamic table*/
	private By locationNamecell=By.xpath("//tr/td[2]");
	 
	
	//**************location search*********************//
	private By location_search=By.xpath("//input[@class='form-control form-control-sm']");
	private By table = By.xpath("//table[@id='example']//tbody");
	private By row = By.tagName("tr");
	private By Columns = By.tagName("td");
	private By loc=By.xpath("//td[2]");
	//*********download************
    private By excel=By.xpath("//*[@id=\"example_wrapper\"]/div[1]/button[1]");
    private By pdf=By.xpath("//*[@id=\"example_wrapper\"]/div[1]/button[2]");
    //**********location******************************//
    private By cancel=By.xpath("//a[@class='btn btn-danger']");
    //************message******************//
    private By verryfy_message=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
    private By duplicate=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
    //****************delete*****************//
    private By delete=By.xpath("//td[6]//a[2]");
    private By status=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]");
    // *************button***************//
 	private By edit = By.xpath("//td[6]//a[1]");
 	private By update = By.xpath("//button[@name='update_location']");
 	
    
    public Location gettuggel() throws Exception {
    	click(Tuggel, "clicked tuggel button");
    	return this;
    }
    
	public Location getclickedsetting() throws Exception {
		click(setting, "clicked setting");
		return this;
	}
	public Location getclickedlocation() throws Exception {
		clktAction(location, "clicked location page");
		return this;
	}
	public Location getClickedAddLocationButton() throws Exception {
		click(addLocation, "clicked add location button");
		return this;
	}
	public Location getaddlocationName(String locationname) throws Exception {
		 sendKeys(locationName, locationname, "Enter Location Name");
		 return this;
		 
	}
	public Location getclickedSubmitLocationName() throws Exception {
		click(submitLocation, "submit location");
	    return this;
	}
	//*************location search**********//
	public List<WebElement> getlLocationNameCell() {
		return DriverManager.getDriver().findElements(locationNamecell);
		
	}
	
	// ***********insert leave search***********//

	/**public List<WebElement> get_row() {
		WebElement tables = driver.findElement(table);
		return tables.findElements(row);
	}

	public List<WebElement> get_coloun() {
		WebElement tables = driver.findElement(table);
		return tables.findElements(loc);
	}
	public List<WebElement> get_edit_btn() {
		WebElement tables = driver.findElement(table);
		return tables.findElements(edit);
	}
	public WebElement get_edit_location() {
		WebElement tables = driver.findElement(table);
		return tables.findElement(loc);
	}*/
	

	// *********Download*************//
	/**public WebElement get_clk_excel() {
		return driver.findElement(excel);
	}

	public WebElement get_clk_employee_pdf() {
		return driver.findElement(pdf);
	}**/
	//**********button***************//
	/**public WebElement get_clk_cancel_button() {
		return driver.findElement(cancel);
	}
	public WebElement get_update_button() {
		return driver.findElement(update);
	}**/
	
	//*************message**********//
	/**public WebElement get_veryfy_message() {
		return driver.findElement(verryfy_message);
	}
	public WebElement get_duplicate_message() {
		return driver.findElement(duplicate);
	}**/
	//************delete****************//
	/**public WebElement get_status() {
		return driver.findElement(status);
	}
	public List<WebElement> get_delete() {
		return driver.findElements(delete);
	}**/
}
