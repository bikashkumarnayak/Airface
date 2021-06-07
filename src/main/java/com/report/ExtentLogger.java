package com.report;


import java.io.IOException;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.enam.ConfigProperty;
import com.frameworkconstant.Config;
import com.property.PropetyFile;
import com.screenshot.Screenshot;


/*
 * Creating screenshot and attaching to report in Base64Encoding
 */
public final class ExtentLogger {

	private ExtentLogger() {
	}

	public static void pass(String msg) {

		ExtentManager.getExtentTest().pass(msg);
	}

	public static void fail(String msg) {

		ExtentManager.getExtentTest().fail(msg);
	}

	public static void skip(String msg) {

		ExtentManager.getExtentTest().skip(msg);
	}
	
	public static void pass(String Message,boolean isScreenshotNeeded) throws IOException{
		if(PropetyFile.get(ConfigProperty.PASSEDSCREENSHOT).equalsIgnoreCase(Config.getYes()) && isScreenshotNeeded) {
			ExtentManager.getExtentTest().
			pass(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot.getBase64Image()).build());
		}
		else {
			pass(Message);
		}
	}
	public static void fail(String Message,boolean isScreenshotNeeded) throws Exception {
		if(PropetyFile.get(ConfigProperty.FAILEDSCREENSHOT).equalsIgnoreCase(Config.getYes()) && isScreenshotNeeded) {
			ExtentManager.getExtentTest().
			pass(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot.getBase64Image()).build());
		}
		else
		fail(Message);
	}
	public static void skip(String Message,boolean isScreenshotNeeded) throws Exception {
		if(PropetyFile.get(ConfigProperty.SKIPPEDSCREENSHOT).equalsIgnoreCase(Config.getYes()) && isScreenshotNeeded) {
			ExtentManager.getExtentTest().
			pass(Message, MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot.getBase64Image()).build());
		}
		else {
			skip(Message);
		}
	}
	
	
}
