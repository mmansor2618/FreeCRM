package com.freecrm.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class LoginPage extends TestBase {
	
	
	

	
	
	
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}


@FindBy (xpath ="//img[@src='https://freecrm.com/images/freecrm_logo.png']")
	
	WebElement logo;
	
	
@FindBy (xpath="//input[@name='email']")
	
	WebElement  email;



@FindBy (xpath="//input[@name='password']")

WebElement  passwordField;


@FindBy (xpath="(//*[@class='ui fluid large blue submit button'])")

WebElement  loginButton;
	
	


public String getTitle() {
	
	
	String actualTtile = driver.getTitle();
	return actualTtile;
	
	
}


public String getURL() {
	
	
	String actualURL = driver.getCurrentUrl();
	return actualURL;
	
	
}


public boolean logoIsShown() {
	
	boolean flag = logo.isDisplayed();
	
	return flag;
	
	
}


public  void performLogin() throws  InterruptedException, IOException {
	
	
	driver.get("https://ui.freecrm.com/");
	
	Thread.sleep(4000);
	
	 email.sendKeys(prop.getProperty("userName"));
	 passwordField.sendKeys(prop.getProperty("password"));
		loginButton.click();
		
	
	
	
		
		
		
	
	
	
}


	
 
}
