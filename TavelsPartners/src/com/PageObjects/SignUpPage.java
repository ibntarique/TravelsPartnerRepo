package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	public  SignUpPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(linkText ="Sign Up")
	
	public WebElement signUp;
	
	
	@FindBy(name ="firstname")
	
	public WebElement firstNameTextBox;
	
	
	@FindBy(name = "lastname")
	
	public WebElement lastNameTextBox;
	
	
	@FindBy(name = "phone")
	
	public WebElement phoneNumber;
	
	
	
	@FindBy(name = "email")
	
	public WebElement eMail;
	
	
	@FindBy(name = "password")
	
	public WebElement passwordTextBox;
	
	
	@FindBy(name = "confirmpassword")
	
	public WebElement confirmPasswordTextBox;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	
	public WebElement signUpBtn;
	
	
}
