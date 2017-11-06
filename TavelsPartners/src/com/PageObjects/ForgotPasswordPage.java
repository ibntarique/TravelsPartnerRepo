package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage 
{
	
	public  ForgotPasswordPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="resetemail")
	public WebElement emailTextbox; 
	
	
	@FindBy(xpath="//button[text()='Reset']")
	public WebElement resetBtn;
	
	
	//@FindBy(xpath=".//*[@id='loginfrm']/div[5]/div[2]/a")
	@FindBy(linkText="Forget Password")
	public WebElement forgetpasswordLink;
	
	
	@FindBy(xpath="//div[text()='Email Not Found']")
	public WebElement emailNotFound;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement passwordSentSucessufully;
	
	
	//@FindBy(className="close")
	@FindBy(xpath="//button[@class='close']")
	public WebElement closeForgetPassword;
	
	
}
