package com.freecrm.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.freecrm.util.WebListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebListener webListener;
	
	public TestBase() throws IOException {
		

		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Testing Scripts\\FreeCRMApplication\\src\\com\\freecrm\\config\\config.properties");
		prop.load(fis);
		
	}

	public void intial(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\cores045\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
       if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","D:\\Program Sources\\Selenium Web Driver\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		webListener = new WebListener();
		e_driver.register(webListener);
		driver = e_driver;
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
		
		
	}
	
}
