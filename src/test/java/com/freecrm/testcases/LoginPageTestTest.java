package com.freecrm.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.freecrm.base.TestBase;
import com.freecrm.pages.LoginPage;




public class LoginPageTestTest extends TestBase {
	
	
	/* two types of assertions :
	 * 1- hard assertion if fail : any code comes after it will not be executed
	 * 2- soft assertion : if fail any code comes after it will be executed. 
	 * also it is useful to be used when we want to assert more than 1 assertion in the same testcase
	 * code will not be executed after assert all function if assertion is failed
	 * if we have more than 1 assertion and one of them fail. the test case will be treated as fail
	 */
	
	
	
  public LoginPageTestTest() throws IOException {
		super();
		
	}
  
  
  LoginPage loginPage;
  
  

  
  
  
  


@Test (priority = 1)
  
  public void titleTest() throws  InterruptedException {
	  
	  SoftAssert softAssert = new SoftAssert();
	  
		String expectedResult = "ree CRM software for customer relationship management, sales, marketing campaigns and support.";
		String actualResult = loginPage.getTitle();
		Thread.sleep(2000);
		
		
		System.out.println(actualResult);
		
	//	Assert.assertEquals(actualResult, expectedResult);
		
		//Assert.assertFalse(true);
		
		// Assert.assertNotEquals(actualResult, expectedResult, "The title is  not correct" );
		
		softAssert.assertNotEquals(actualResult, expectedResult, "The title is  not correct" );
		
		//softAssert.assertEquals(actualResult, expectedResult);
		
	
		System.out.println("hello");
		
	
		softAssert.assertAll();
		
		
		
		System.out.println("hello world");
		

		
		
		
		 
  }
  
  
  
  @Test (priority = 2)
  public void urlCheck() throws IOException, InterruptedException {
	  
	  String expectedResult = "https://freecrm.com/";
		String actualResult = loginPage.getURL();
		Thread.sleep(2000);
		
		System.out.println(actualResult);
		
		Assert.assertEquals(actualResult, expectedResult, "the URl is not correct");
		
		
		
  }
  
  
  
  @Test (priority = 3)
  public void logoTest() throws  IOException, InterruptedException {
	  
		
		
		boolean actualResult = loginPage.logoIsShown();
		
		System.out.println(actualResult);
		
		//Assert.assertEquals(actualResult, expectedResult);
		
		Assert.assertTrue(actualResult, "The logo is not displayed");
		
		Thread.sleep(2000);
		
		
  }
  
  @Test (priority = 4)
  
public void loginTest() throws InterruptedException, IOException {
	  
	  
	
		
		
	  
		
         loginPage.performLogin();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		//String actualResult = driver.getTitle();
		
		//Assert.assertEquals(actualResult, expectedResult, "it was failure because the expected result is not Cogmento CRM");
		
		
		
		
	/*	Thread.sleep(3000);
		
		
		
		WebElement billing = driver.findElement(By.linkText("Free account"));
		
		billing.click();
		
		
		
		String expectedResult = "https://ui.freecrm.com/settings/billing/";
		
		
		
		String actualResult = driver.getCurrentUrl();
		
		
		Assert.assertEquals(actualResult, expectedResult, "it was failure because the expected result is not https://ui.freecrm.com/settings/billing/");
		
		*/
  } 
  
  
  @Parameters({"browser"})
 @BeforeMethod
	
	public void setup(String browser) throws IOException {
	  
	 
		
	 intial(browser);
	 
	 loginPage = new LoginPage();
		
	}
	
  @AfterMethod
	
	public void tearDown() {
	   
	   
	   driver.quit();
	   
 }
  
 
  
  
 
  
}
