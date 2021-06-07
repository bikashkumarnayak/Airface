package pageObject;

import org.openqa.selenium.By;

import com.utility.CommonUtulity;

import decodeUtils.Decode;


public class Userlogin extends CommonUtulity {

	
	
	   private final  By select_lang=By.id("navbarDropdown2");
       private final  By language=By.id("En");
	   private final  By username=By.xpath("//input[@id='useremail']");
	   private final  By password=By.xpath("//input[@id='userpassword']");
	   private final  By admin=By.xpath("//div[3]//div[1]//input[1]");
	   private final  By login=By.xpath("//input[@id='submit_login']");
	   private final  By testMessage=By.xpath("//*[@id=\"loginform\"]/div[1]/div");

		
	   
	   
	   
	   
	   
	   
	   public Userlogin gettextMessage() throws Exception {
		   getText(testMessage, "print message");
		   return this;
	   }
		public  Userlogin getSelect_lang() throws Exception {
			 click(select_lang, "click language button");
			 return this;
		}
		public  Userlogin getlanguage() throws Exception {
			click(language, "select language");
			 return this;
		}
		public  Userlogin getuser(String user) throws Exception {
			 sendKeys(username, user, "username");
			 return this;
		}
		public  Userlogin getpass(String Pass) throws Exception {
			sendKeys(password, Pass, "username");
			 return this;
		}
		public Userlogin getAdmin() throws Exception {
			
			click(admin, "admin button");
			return this;
		}
		public Userlogin getLogin() throws Exception {
			click(login, "login button");
			return this;
		}
	

}
