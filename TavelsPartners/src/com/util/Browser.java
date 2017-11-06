/**
 * 
 */
package com.util;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;



/**
 * @author Tarique
 *
 */
public class Browser {
	
	private WebDriver driver;
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver(String appURL,String browserType)
	{
		
		
		switch (browserType) {
		case "FirefoxDriver":
			driver = initializeFirefoxDriver(appURL);
			
			break;

		case "ChromeDriver":
			driver = initializeChromeDriver(appURL);
			break;
			
		default:
			driver = initializeFirefoxDriver(appURL);
		}
	}
	
	@BeforeClass
	@Parameters({"appURL","browserType"})

	public void initializeBase(String appURL,String browserType)
	{
		try {
			
			setDriver(appURL, browserType);
			
		} catch (Exception e) {
			
			
			System.out.println("Browser couldn't be launched");
		}
	
	}
	
	public WebDriver initializeFirefoxDriver(String appURL)
	{
		
		driver = new FirefoxDriver();
		
		System.out.println("Browser Launch Successfully...");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(appURL);
		return driver;
		
	}
	
	public WebDriver initializeChromeDriver(String appURL)
	{
		System.setProperty("webdriver.chrome.driver", "\\.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(appURL);
		return driver;
		
	}
	
	public int add(int x)
	{
		return 10;
	}
	
	@AfterClass
	
	
	public void dismiss()
	{
		driver.quit();
	}

}
