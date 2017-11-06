/**
 * 
 */
package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.PageObjects.WelcomePage;
import com.util.Browser;

/**
 * @author Tarique
 *
 */
public class LoginPageTest extends Browser {
	
	static WebDriver driver;
	
	LoginPage loginpage;
	
	static String actualpage;
	
	static String  expectedPage = "Login";
	
	@BeforeClass
	public void beforeclass()
	{
		
		driver = getDriver();
		
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	
	@BeforeMethod
	
	public void beforemethod() throws InterruptedException
	{
		loginpage = new LoginPage(driver);
		
		Thread.sleep(3000);
	}
	
	@Test(priority=1,enabled=false)
	public void verifyValidLogin() throws InterruptedException
	{
		System.out.println("Login page test for valid username and password");
		

		loginpage.emailTextBox.clear();		
		loginpage.emailTextBox.sendKeys("user@phptravels.com");
		
		Thread.sleep(3000);
		loginpage.passwordTextBox.clear();
		loginpage.passwordTextBox.sendKeys("demouser");
		
		loginpage.LoginButton.click();
		
		Thread.sleep(3000);
		actualpage = driver.getTitle();
		//System.out.println(actualpage);
		if (actualpage=="Login") 
		{
			System.out.println("Login Failed");
		}
		else
		{
			System.out.println("Login successfully");
			WelcomePage welcomepage = new WelcomePage(driver);
			welcomepage.Logoutpre.click();
			welcomepage.Logoutclk.click();
			
		}
		
	}
	
	@Test(priority=2,enabled=true)
	public void verifyInValidUsernameLogin() throws InterruptedException
	{
		System.out.println("Login page test for Invalid username");
		
		loginpage.emailTextBox.clear();
		loginpage.emailTextBox.sendKeys("user@phptravels");
		
		Thread.sleep(3000);
		loginpage.passwordTextBox.clear();
		loginpage.passwordTextBox.sendKeys("demouser");
		
		loginpage.LoginButton.click();
		
		if (loginpage.InvalidEmailPassword.isDisplayed()) {
			
			System.out.println("Login unsucessful");
		}
	}
	
	@Test(priority=3,enabled=true)
	public void verifyInValidPasswordLogin() throws InterruptedException
	{
		System.out.println("Login page test for Invalid password");
		
		loginpage.emailTextBox.clear();
		loginpage.emailTextBox.sendKeys("user@phptravels.com");
		
		Thread.sleep(3000);
		loginpage.passwordTextBox.clear();
		loginpage.passwordTextBox.sendKeys("demo");
		
		loginpage.LoginButton.click();
		
		if (loginpage.InvalidEmailPassword.isDisplayed()) {
			
			System.out.println("Login unsucessful");
		}
	}
	
	@Test(priority=4,enabled=true)
	public void verifyInValidUsernameAndPasswordLogin() throws InterruptedException
	{
		System.out.println("Login page test for Invalid username and password");
		

		loginpage.emailTextBox.clear();
		loginpage.emailTextBox.sendKeys("user@phptravels.com");
		
		Thread.sleep(3000);
		loginpage.passwordTextBox.clear();
		loginpage.passwordTextBox.sendKeys("demo");
		
		loginpage.LoginButton.click();
		
		if (loginpage.InvalidEmailPassword.isDisplayed()) {
			
			System.out.println("Login unsucessful");
		}
	}
	
	@Test(priority=5,enabled=true)
	public void verifyBlankUsernameAndPasswordLogin() throws InterruptedException
	{
		System.out.println("Login page test for Blank username and password");
		

		loginpage.emailTextBox.clear();
		loginpage.emailTextBox.sendKeys("");
		
		
		Thread.sleep(3000);
		loginpage.passwordTextBox.clear();
		loginpage.passwordTextBox.sendKeys("");
		
		loginpage.LoginButton.click();
		
		if (loginpage.InvalidEmailPassword.isDisplayed()) {
			
			System.out.println("Login unsucessful");
		}
	}
	
	
	
}
