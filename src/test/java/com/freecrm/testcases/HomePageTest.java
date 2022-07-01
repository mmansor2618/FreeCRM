package com.freecrm.testcases;


import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.freecrm.base.TestBase;
import com.freecrm.pages.HomePage;




public class HomePageTest extends TestBase {
	
	
	
	
	public HomePageTest() throws IOException {
		super();
	}
	
	 HomePage homePage;
	


	@Test (priority = 5)
	 
	public void clickOnPricingTest() throws InterruptedException, IOException   {
		
		
		
		
		homePage.clickOnPricing();
		
		
		Thread.sleep(2000);
		
	}
	
	
	@Test (priority = 6)
	
public void clickOnFeaturesTest() throws  InterruptedException, IOException {
		
		
		
		
		homePage.clickOnFeatures();
		
		Thread.sleep(2000);
	
		
		
		
	}
	
	
@Parameters({"browser"})
@BeforeMethod
	
	public void beforeSetup(String browser) throws IOException {
		
		intial(browser);
		
	 homePage = new HomePage();
	}
	
   @AfterMethod
	
	public void AfterSetup() {
	   
	   
	   driver.quit();
	   
   }
	
	
	

}
