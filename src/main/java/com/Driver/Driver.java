package com.Driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.enam.ConfigProperty;
import com.frameworkconstant.Config;
import com.property.PropetyFile;



public class Driver {

	
	public static void initializeDriver()  {

		
		// String browserName=System.getProperty("browser");
		String browserName =PropetyFile.get(ConfigProperty.BROWSER) ;
		System.out.println(browserName);
		if(Objects.isNull(DriverManager.getDriver())) {
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

			WebDriver driver = new ChromeDriver(c);
			DriverManager.setDriver(driver);
		}	

		} else if (browserName.equals(Config.getFirefoxbrowser())) {
			DesiredCapabilities ch = DesiredCapabilities.firefox();
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			FirefoxOptions c = new FirefoxOptions();
			c.merge(ch);
			System.setProperty(Config.getFirefox(),Config.getFirefoxpath());
			
			WebDriver driver = new FirefoxDriver();
			DriverManager.setDriver(driver);

		} else {
			System.out.println("browser not Present");
		}
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().manage().deleteAllCookies();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverManager.getDriver().get(PropetyFile.get(ConfigProperty.URL));
		
	}
	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
			
		}
	}

}
