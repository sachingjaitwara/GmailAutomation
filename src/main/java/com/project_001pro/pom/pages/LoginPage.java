package com.project_001pro.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="identifierId")
	private WebElement emailtb;
	
	@FindBy(xpath="//span[@jsname='V67aGc']")
	private WebElement nextbtn;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getEmail() {
		return emailtb;
	}
	
	public WebElement nextBtn() {
		 return nextbtn;
	}
	
	public WebElement getPassword() {
		return passwordtb;
	}

}
