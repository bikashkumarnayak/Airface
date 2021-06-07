package com.Driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	private static WebDriver driver;

	private DriverManager() {

	}

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver driverref) {
		dr.set(driverref);
	}

	public static void unload() {
		dr.remove();
	}

}
