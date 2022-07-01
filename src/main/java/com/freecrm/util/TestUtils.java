package com.freecrm.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.freecrm.base.TestBase;

public class TestUtils extends TestBase {

	public TestUtils() throws IOException {
		super();
		
	}
	
	public static void takeSnapshot (String name) throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\Testing Scripts\\FreeCRMApplication\\Snapshots\\"+name+".png"));
	}
	
	
	
	

}
