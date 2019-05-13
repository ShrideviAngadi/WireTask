package com.wireassignment.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Class for setting up the excel file for data driven approach
 */
public class UtililtyFunctions extends BaseTest{
	@SuppressWarnings("rawtypes")

	/**
	 * Constructor to initialize Utils class
	 * @param WebDriver driver 
	 */
	public UtililtyFunctions(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    }
		
	/**
	 * Instance method to scroll into the web page
	 * @param WebElement 
	 */
	public void scrollTillElement(WebElement element){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" , element);
	}

	/**
	 * Get the name of currently executed function
	 * @return String 
	 */
	public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getClassName() + "." + Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}

