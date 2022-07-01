package com.freecrm.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Example {

	@Test
	
	public void printValues() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Testing Scripts\\FreeCRMApplication\\src\\com\\freecrm\\config\\config.properties");
		prop.load(fis);
		
		String url= prop.getProperty("URL");
		
		System.out.println(url);
		
	
	}
}
