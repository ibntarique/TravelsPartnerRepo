/**
 * 
 */
package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Tarique
 *
 */
public class WelcomePage{

	public WebDriver driver;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul/li[2]/a/b[@class='lightcaret mt-2']")	
	
	public WebElement Logoutpre;
	
	
	
	@FindBy(xpath="//a[text()='  Logout']")
	
	public WebElement Logoutclk;

	
	
}