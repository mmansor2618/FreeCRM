package com.freecrm.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class HomePage extends TestBase {
	

	// @FindBy(xpath="//a[@class='nav-link bold' and text()='Sign in']") WebElement homeSignInLink;   
   // @FindBy(xpath="//a[text()='Recruiter sign in']") WebElement recruiterSignInLink; 
    
   


	
	
	
	
public HomePage() throws IOException {
		
	PageFactory.initElements(driver, this);
		
	}



@FindBy (linkText="Pricing")

WebElement pricing;


@FindBy (linkText="Features")

WebElement features;


public void  clickOnPricing() {
	
	
	
	 
pricing.click();
		
		
	
	
}


public void  clickOnFeatures() {
	
	
	
	
	 
features.click();
		
		
	
	
}


}
