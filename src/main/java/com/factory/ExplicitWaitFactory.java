package com.factory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Driver.DriverManager;
import com.frameworkconstant.Config;



/*
 * Managing different explicit wait and returning webElement to perform action on it
 */
public final class ExplicitWaitFactory {
	private ExplicitWaitFactory() {
	}

	public static WebElement explicitWaitForElementToBeClickable(By by) {
		return new WebDriverWait(DriverManager.getDriver(), Config.getExplicitywait())
				.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static WebElement explicitWaitForElementToBePresent(By by) {
		return new WebDriverWait(DriverManager.getDriver(), Config.getExplicitywait())
				.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public static WebElement explicitWaitForElementToBeVisiable(By by) {
		return new WebDriverWait(DriverManager.getDriver(), Config.getExplicitywait())
				.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}