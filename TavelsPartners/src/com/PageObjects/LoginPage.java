package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(name="username")	
	
	public WebElement emailTextBox;
	
	
	@FindBy(name="password")
	
	public WebElement passwordTextBox;

	
	
	@FindBy(xpath="//button[text()='Login']")
	
	public WebElement LoginButton;
	
	
	@FindBy(xpath="//div[text()='Invalid Email or Password']")
	
	public WebElement InvalidEmailPassword;
	

	
	
}
