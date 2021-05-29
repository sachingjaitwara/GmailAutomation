package com.project_001pro.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.project_001pro.genericlib.BaseClass;
import com.project_001pro.pom.pages.ComposeBox;
import com.project_001pro.pom.pages.HomePage;
import com.project_001pro.pom.pages.LoginPage;

public class SignIn extends BaseClass{
	
	@Test
	public void Test1() throws InterruptedException, FileNotFoundException, IOException {
		
		String loginPageTitle="Gmail";
		String expLoginPageTitle=driver.getTitle();
		Assert.assertEquals(loginPageTitle, expLoginPageTitle);
		/**
		 * for login page
		 */
		LoginPage l=new LoginPage(driver);
		l.getEmail().sendKeys(p.getPropertiesFileData("email"));;
		l.nextBtn().click();
		Thread.sleep(1000);
		l.getPassword().sendKeys(p.getPropertiesFileData("password"));
		
		u.explicitWait(driver,l.nextBtn());
		
		l.nextBtn().click();
		/**
		 * for home page
		 */
		HomePage h=new HomePage(driver);
		
		String HomePageTitle="Gmail";
		String expHomePageTitle=driver.getTitle();
		Assert.assertEquals(HomePageTitle, expHomePageTitle);
		
		h.getCompose();
		
		/**
		 * for compose box
		 */
		ComposeBox b=new ComposeBox(driver);
		b.getTo_data(p.getPropertiesFileData("tocompose"));
		b.getSubject_data(p.getPropertiesFileData("subjectcompose"));
		b.getBody_data(p.getPropertiesFileData("bodycompose"));
		
		
		if(b.getSendbtn().isEnabled()) {
			System.out.println("send button is enabled");
		}
		
		b.getSendbtn().click();
		
	}

}
