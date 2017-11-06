/**
 * 
 */
package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


/**
 * @author Tarique
 *
 */
public class CaptureScreenUI {

	public static void getScreenShot(WebDriver driver,String screenshotName) throws IOException
	{
				
		try {
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source,new File("./Screenshot/"+"screenshotName"+".png"));
			
			
		} 
		catch (Exception e) {

			System.out.println("Exception while capturing Screenshot : "+e);
			
		}
		
		
	}

}
