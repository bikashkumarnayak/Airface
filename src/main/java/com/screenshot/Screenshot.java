package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Driver.DriverManager;
import com.frameworkconstant.Config;



public final class Screenshot {
	
	private Screenshot() {
		
	}
	
	public static File getScreenshot(String result) throws Exception {
		File scr = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr, new File(Config.getScreenshotpath() + result + Config.getScreenshotformat()));
		return scr;
		
	}
	
	public static String getBase64Image() throws IOException {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		
	}

}
