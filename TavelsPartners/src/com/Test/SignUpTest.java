/**
 * 
 */
package com.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageObjects.SignUpPage;
import com.util.Browser;

/**
 * @author Tarique
 *
 */
public class SignUpTest extends Browser{

	
	WebDriver driver;
	
	SignUpPage signUpPage;
	@BeforeClass
	public void beforeclass()
	{
		driver = getDriver();
		
	}
	@BeforeMethod
	public void beforetest() throws InterruptedException
	{
		signUpPage = new SignUpPage(driver);
		Thread.sleep(3000);
		
		signUpPage.signUp.click();
		
	}
	
	@Test(priority =1)
	public void enterAlphaNumericFirstandLastNameSignUp()
	{
		
		signUpPage.firstNameTextBox.sendKeys("Tar123");
		
		signUpPage.lastNameTextBox.sendKeys("456yun");
		
		signUpPage.phoneNumber.sendKeys("9762421781");
		
		signUpPage.eMail.sendKeys("trqhmn@gmail.com");
		
		signUpPage.passwordTextBox.sendKeys("ibnhumayun");
		
		signUpPage.passwordTextBox.sendKeys("ibnhumayun");
		
		signUpPage.firstNameTextBox.submit();
		
	}
	
/*	@Test
	public void enterAlphabetPhoneNo()
	{
		
		signUpPage.phoneNumber.sendKeys("PhoneNo");
		
		signUpPage.phoneNumber.submit();
		
	}*/
	
	
	
}
