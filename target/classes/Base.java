package resource;

import java.io.File;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.enam.ConfigProperty;
import com.frameworkconstant.Config;
import com.property.PropetyFile;


public class Base {

	
	public static WebDriver driver;
	
	public static Logger log = org.apache.logging.log4j.LogManager.getLogger(Base.class.getName());

	public static void initializeDriver() throws Exception {

		
		// String browserName=System.getProperty("browser");
		String browserName =PropetyFile.get(ConfigProperty.BROWSER) ;
		System.out.println(browserName);
		if(Objects.isNull(driver)) {
		if (browserName.equals(Config.getChromebrowser())) {
			// Set desired capabilities for chrome
			DesiredCapabilities ch = DesiredCapabilities.chrome();
			// ch.acceptInsecureCerts();
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions c = new ChromeOptions();
			c.merge(ch);
			c.addArguments(Config.getArguments());
			System.setProperty(Config.getSilentoutput(), Config.getTrue());
			System.setProperty(Config.getChrome(),
					Config.getChromepath());
//			ChromeOptions options=new ChromeOptions();
//			if(browserName.contains("headless"))
//			options.addArguments("headless");

			driver = new ChromeDriver(c);
		}	

		} else if (browserName.equals(Config.getFirefoxbrowser())) {
			DesiredCapabilities ch = DesiredCapabilities.firefox();
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			FirefoxOptions c = new FirefoxOptions();
			c.merge(ch);
			System.setProperty(Config.getFirefox(),Config.getFirefoxpath());
			
			driver = new FirefoxDriver();

		} else {
			System.out.println("browser not Present");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(PropetyFile.get(ConfigProperty.URL));
		
	}
	public static void quitDriver() {
		if (Objects.nonNull(driver)) {
			driver.quit();
			
		}
	}

	

	
	

}
	

	

