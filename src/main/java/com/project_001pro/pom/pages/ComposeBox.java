package com.project_001pro.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComposeBox {
		
		@FindBy(id=":6q")
		private WebElement to_box;
		
		@FindBy(id=":78")
		private WebElement subject_box;
		
		@FindBy(id=":63")
		private WebElement body_box;
		
		@FindBy(id=":7i")
		private WebElement sendbtn;
		
		public ComposeBox(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void getTo_data(String string) {
			to_box.sendKeys(string);
		}
		
		public void getSubject_data(String string) {
			subject_box.sendKeys(string);
		}
		
		public void getBody_data(String string) {
			body_box.sendKeys(string);
		}
		
		public WebElement getSendbtn() {
			return sendbtn;
		}

}
