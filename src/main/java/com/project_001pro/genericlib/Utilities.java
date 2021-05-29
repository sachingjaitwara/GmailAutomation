package com.project_001pro.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	/**
	 * to wait explicitly for an element 
	 * @param driver
	 * @param ele
	 */
	public void explicitWait(WebDriver driver,WebElement ele) {
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
