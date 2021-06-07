package settings;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.annotation.FrameworkAnnotation;
import com.dataprovaider.DataprovaiderTestData;
import com.dataprovaider.DataprovaiderUtiles;
import com.enam.CatagaryType;

import pageObject.Location;
import pageObject.Userlogin;
import resource.TestBase;

public final class LocationPage extends TestBase {
	private LocationPage() {

	}

	@FrameworkAnnotation(authors = { "bikash" }, category = { CatagaryType.REGRESSION })
	@Test(testName="verifayed login page",dataProvider = "AirfaceData",dataProviderClass = DataprovaiderTestData.class,
			description = "Verifay give the right data")
	private void loginpage3rddata(String user,String pass) throws Exception {
		Userlogin log=new Userlogin();
		log.getSelect_lang().getlanguage().getuser(user).getpass(pass).getAdmin();
		log.getLogin();
	}
	@FrameworkAnnotation(authors = { "Bikash" }, category = { CatagaryType.REGRESSION })
	@Test(testName = "Location page ", description = "verifayed location page",
	dataProvider = "getLocattiondata", dataProviderClass = DataprovaiderUtiles.class,priority = 1)

	// @Test(testName="Location page ",description = "verifayed location page")
	public void addLocation(Map<String, String> data) throws Exception {
		Location loc = new Location();
		Thread.sleep(3000);
		loc.gettuggel();
		Thread.sleep(3000);
		loc.getclickedsetting();
		Thread.sleep(2000);
		loc.getclickedlocation();
		List<WebElement> locCell = loc.getlLocationNameCell();
		int count=0;
		for (WebElement ele : locCell) {
			String text = ele.getText();
			if (text.equals(data.get("EmpLocation"))) {
				count++;
				System.out.println("Location is already added");
				break;
			}
		}
		while(count==0) {
					loc.getClickedAddLocationButton();
					Thread.sleep(2000);
					loc.getaddlocationName(data.get("EmpLocation")).getclickedSubmitLocationName();
				break;
		}

	}
}
