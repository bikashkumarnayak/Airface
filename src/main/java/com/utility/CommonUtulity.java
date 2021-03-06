package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import com.Driver.DriverManager;
import com.factory.ExplicitWaitFactory;
import com.report.ExtentLogger;
   

public class CommonUtulity {

	Actions action;
	 JavascriptExecutor js;
	protected  void border(By by) {
		js = ((JavascriptExecutor) DriverManager.getDriver());
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid red;');", DriverManager.getDriver().findElement(by));
	}

	protected void scroll(By by) {
		js = ((JavascriptExecutor) DriverManager.getDriver());
		js.executeScript("arguments[0].scrollIntoView();", DriverManager.getDriver().findElement(by));
	}
	
	
	protected  void frame(By by) {
		DriverManager.getDriver().switchTo().frame(DriverManager.getDriver().findElement(by));
	}


	protected void selectAction(By by,String elementNameForReport) throws Exception {
		 action=new Actions(DriverManager.getDriver());
		ExplicitWaitFactory.explicitWaitForElementToBeVisiable(by);
		action.moveToElement(DriverManager.getDriver().findElement(by)).build().perform();
		ExtentLogger.pass(elementNameForReport + " - clicked Successfully.",true);
	}
	protected void clktAction(By by,String elementNameForReport) throws Exception {
		action=new Actions(DriverManager.getDriver());
		ExplicitWaitFactory.explicitWaitForElementToBeClickable(by);
		action.moveToElement(DriverManager.getDriver().findElement(by)).click().build().perform();
		ExtentLogger.pass(elementNameForReport + " - clicked Successfully.",true);
	}
	protected Boolean errormessage(By by) {
		js = ((JavascriptExecutor) DriverManager.getDriver());
		return (Boolean)js.executeScript("return arguments[0].checkValidity();", DriverManager.getDriver().findElement(by));
	}
	protected String printerrormessage(By by,String elementNameForReport ) {
		js = ((JavascriptExecutor) DriverManager.getDriver());
		return (String)js.executeScript("return arguments[0].validationMessage;", DriverManager.getDriver().findElement(by));
		
	}
	private Select getSelectWebElement(By by) {
		Select select = new Select(DriverManager.getDriver().findElement(by));
		return select;
	}
	protected void wait(By by, int milliSeconds) {
		try {
			DriverManager.getDriver().findElement(by).wait(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void click(By by, String elementNameForReport) throws Exception {
		ExplicitWaitFactory.explicitWaitForElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).click();
		ExtentLogger.pass(elementNameForReport + " - clicked Successfully.",true);
	}

	protected void clear(By by, String elementNameForReport) throws Exception {
		ExplicitWaitFactory.explicitWaitForElementToBeVisiable(by);
		DriverManager.getDriver().findElement(by).clear();
		ExtentLogger.pass(elementNameForReport + " - cleared Successfully.",true);
	}

	protected void sendKeys(By by, String value, String elementNameForReport) throws Exception {
		ExplicitWaitFactory.explicitWaitForElementToBeVisiable(by);
		DriverManager.getDriver().findElement(by).sendKeys(value);
		ExtentLogger.pass(elementNameForReport + " - '" + value + "' sent successfully.",true);
	}
	
	protected String getText(By by, String elementNameForReport) throws Exception {
		ExplicitWaitFactory.explicitWaitForElementToBeVisiable(by);
		String text = DriverManager.getDriver().findElement(by).getText();
		ExtentLogger.pass(elementNameForReport +" - '" + text + "' obtained successfully.",true);
		return text;
	}

	protected boolean isDisplayed(By by) {
		return DriverManager.getDriver().findElement(by).isDisplayed();
	}

	protected boolean isSelected(By by) {
		return DriverManager.getDriver().findElement(by).isSelected();
	}

	protected boolean isEnabled(By by) {
		return DriverManager.getDriver().findElement(by).isEnabled();
	}
	
	protected WebElement getWebElement(By by) {
		return DriverManager.getDriver().findElement(by);
	}

	protected List<WebElement> getAllElements(By by) {
		return DriverManager.getDriver().findElements(by);
	}

	protected boolean isAllElemetsEmpty(By by) {
		return DriverManager.getDriver().findElements(by).isEmpty();
	}

	protected int getAllElemetsEmpty(By by) {
		return DriverManager.getDriver().findElements(by).size();
	}
	
	protected boolean isStringContains(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().contains(value);
	}
	
	protected boolean isStringEquals(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().equals(value);
	}
	
	protected boolean isStringEqualsIgnoreCase(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().equalsIgnoreCase(value);
	}
	
	protected  void selectDropDown(By by, String type,String value) {
		Select select = new Select(DriverManager.getDriver().findElement(by));
		switch (type) {
		case"index":
			select.selectByIndex(Integer.parseInt(value));
		case"value":
			select.selectByValue(value);
		case"visibletext":
			select.selectByVisibleText(value);
		}
	}
	
	protected List<WebElement> getDropDownOptions(By by) {
		return getSelectWebElement(by).getOptions();
	}
	
	protected List<WebElement> getDropDownAllSelectedOptions(By by) {
		return getSelectWebElement(by).getAllSelectedOptions();
	}
	
	protected WebElement getDropDownFirstSelection(By by) {
		return getSelectWebElement(by).getFirstSelectedOption();
	}
	
	protected void deselectDropDownValueByVisibleText(By by, String value) {
		getSelectWebElement(by).deselectByVisibleText(value);
	}
	
	protected void deselectDropDownValueByIndex(By by, int index) {
		getSelectWebElement(by).deselectByIndex(index);
	}
	
	protected void deselectDropDownValueByValue(By by, String value) {
		getSelectWebElement(by).deselectByValue(value);
	}
	
	protected void deselectAllDropDownValueByValue(By by) throws Exception {
		getSelectWebElement(by).deselectAll();
		
	}
	
	protected boolean isMultipleSelectionSupported(By by) {
		return getSelectWebElement(by).isMultiple();
	}
}
