package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Holiday {
	public WebDriver driver;
	public Actions a;
	
	private By holiday=By.xpath("//li[@class='sidebar-item active']//li[5]//a[1]");
	//**********add holiday***************//
	
		private By Add_holiday=By.xpath("//*[@id=\"main-wrapper\"]/div/div[1]/div/div[1]/button");
		private By Date=By.xpath("//input[@placeholder='Enter Date']");
		private By haliday_name=By.xpath("//input[@placeholder='Holiday Name']");
		private By location=By.xpath("//select[@id='empList']");
		private By submit=By.xpath("//input[@name='submit']");
		
		//*************Search holiday**************//
		
		private By table=By.xpath("//table[@id='example']//tbody");
		private By row=By.tagName("tr");
		private By col=By.tagName("td");
		private By holiday_name=By.xpath("//td[4]");
		private By Search_holiday=By.xpath("//input[@class='form-control form-control-sm']");
		private By find_holiday=By.cssSelector(".odd > td:nth-child(4)");
		
		//****message validation**********//
		private By succ=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
	    private By edit_delete_message=By.xpath("//div[@class='alert alert-success alert-dismissible fade show msg_box col-12']");
		//*****button*************//
		private By cancel=By.xpath("//button[@id='close']");
		private By edit=By.xpath("//td[6]//a[1]");
		private By delete=By.xpath("//td[6]//a[3]");
		private By Submit=By.xpath("//input[@name='submit']");
		//*************edit*************//
		private By edt_hol_name=By.xpath("//input[@placeholder='Enter holiday']");
		private By edt_location=By.xpath("//select[@id='empList']");
		
		
		
		
	
	public Holiday(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement get_holiday() {
		return driver.findElement(holiday);
	}
	//**************Add Holiday*********//
	
		public WebElement get_add_holiday() {
			return driver.findElement(Add_holiday);
		}
		public WebElement get_holiday_date() {
			return driver.findElement(Date);
		}
		public WebElement get_holiday_name() {
			return driver.findElement(haliday_name);
		}
		public WebElement get_location() {
			return driver.findElement(location);
		}
		public WebElement get_clk_save_btn() {
			return driver.findElement(submit);
		}
		
		//*******search holiday****************//

		public WebElement get_search_holiday() {
			return driver.findElement(Search_holiday);
		}
		public WebElement get_find_holiday() {
			return driver.findElement(find_holiday);
		}
		public List<WebElement> get_row() {
			WebElement tables = driver.findElement(table);
			return tables.findElements(row);
		}
		public List<WebElement> get_col() {
			WebElement tables = driver.findElement(table);
			return tables.findElements(col);
		}
		public List<WebElement> get_holiday_nm() {
			WebElement tables = driver.findElement(table);
			return tables.findElements(holiday_name);
		}
		//*************button***************//
		public List<WebElement> get_edit() {
			return driver.findElements(edit);
		}
		public List<WebElement> get_delete() {
			return driver.findElements(delete);
		}
		public WebElement get_submit() {
			return driver.findElement(Submit);
		}
		
		//*******message validation*********//
		
		public WebElement get_success_msg() {
			return driver.findElement(succ);
		}
		public WebElement get_veryfay_Message() {
			return driver.findElement(edit_delete_message);
		}
		//**********cancel***************
		public WebElement get_cancel() {
			return driver.findElement(succ);
		}
		//***************edit************//
		public WebElement get_edit_name() {
			return driver.findElement(edt_hol_name);
		}
		public WebElement get_edit_location() {
			return driver.findElement(edt_location);
		}
	
		

}

