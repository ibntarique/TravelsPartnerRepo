package com.Test;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.PageObjects.ForgotPasswordPage;
import com.util.*;

public class ForgotPasswordTest extends Browser{

	public static WebDriver driver ;
	
	ForgotPasswordPage forgotPasswordpage;
	
	@BeforeClass
	public void beforeTest()
	{
		
		driver = getDriver();
			
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		
		forgotPasswordpage  = new ForgotPasswordPage(driver);

		Thread.sleep(3000);
		
		forgotPasswordpage.forgetpasswordLink.click();
		forgotPasswordpage.emailTextbox.clear();
		
	}

	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus()) 
		{
			
			CaptureScreenUI.getScreenShot(driver, result.getName());
			
		}
		forgotPasswordpage.closeForgetPassword.click();
	}
	
	
	@Test(priority=1,enabled=false)
	public void enterValidEmail() throws InterruptedException
	{
		
		forgotPasswordpage.emailTextbox.sendKeys("user@phptravels.com");
		Thread.sleep(3000);
		forgotPasswordpage.resetBtn.click();
		Thread.sleep(3000);
		if (forgotPasswordpage.passwordSentSucessufully.isDisplayed()==true) {
		
			System.out.println("New Password sent to email...");
		}
		
		else
			System.out.println("Invalid email ID...");
	}
	
	
	@Test(priority=2,enabled=true)
	public void enterinvalidEmail() throws InterruptedException, IOException 
	{
		
		forgotPasswordpage.emailTextbox.sendKeys("user@ph");
		Thread.sleep(3000);
		
		//Using submit method instead of click by apply any of the locator inside the form
		
		forgotPasswordpage.resetBtn.click();
		
		
		Thread.sleep(3000);
		if (forgotPasswordpage.emailNotFound.isDisplayed()==true) {
			
			System.out.println("Invalid email ID...");
			
		}
		else
			System.out.println("Email ID is valid...");
		
		
	
		CaptureScreenUI.getScreenShot(driver,"InvalidTextResetPassword");
		
	}
	
	
	

}
